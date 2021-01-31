/*
    https://programmers.co.kr/learn/courses/30/lessons/17678
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 1차 셔틀버스
 */
package programmers.courses30.lesson17678;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    final String START_TIME = "09:00";

    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        // 일찍 온 직원부터 정렬
        Queue<Time> personQueue = new PriorityQueue<>();
        for (String time : timetable) {
            personQueue.offer(new Time(time));
        }

        // 시간대별로 버스 Queue 생성
        Queue<Time> busQueue = new LinkedList<>();
        busQueue.offer(new Time(START_TIME));
        int hour = 9;
        int minute = 0;
        for (int i = 1; i <= n - 1; i++) {
            minute += t;
            hour += minute / 60;
            minute = minute % 60;
            busQueue.offer(new Time(hour, minute));
        }

        // 막차 전까지 버스에 순서대로 탑승
        while (busQueue.size() > 1) {
            Time bus = busQueue.poll();
            for (int i = 0; i < m; i++) {
                if (!personQueue.isEmpty() && bus.compareTo(personQueue.peek()) > 0) {
                    personQueue.poll();
                }
            }
        }

        // 막차
        if (personQueue.size() < m) answer = busQueue.peek().toString();
        else if (personQueue.size() >= m) {
            if (personQueue.peek().hour == 23 && personQueue.peek().minute == 59) answer = START_TIME;
            else {
                if (personQueue.peek().minute -1 < 0 ) {
                    answer = (new Time(personQueue.peek().hour - 1, 59).toString());
                } else {
                    answer = (new Time(personQueue.peek().hour, personQueue.peek().minute - 1).toString());
                }
            }
        }

        return answer;
    }
}

class Time implements Comparable<Time> {
    int hour;
    int minute;

    Time(String time) {
        String[] times = time.split(":");
        this.hour = Integer.parseInt(times[0]);
        this.minute = Integer.parseInt(times[1]);
    }

    Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public int compareTo(Time person) {
        return ((this.hour - person.hour) == 0) ? this.minute - person.minute : this.hour - person.hour;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}