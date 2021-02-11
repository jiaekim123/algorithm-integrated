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
                if (personQueue.isEmpty()) break;
                if (bus.compareTo(personQueue.peek()) >= 0) {
                    personQueue.poll();
                }
            }
        }

        // 막차
        if (personQueue.size() < m) answer = busQueue.peek().toString(); // 버스에 남은 자리보다 사람이 적을 때 버스 시간 반환
        else { // 버스에 남은 자리보다 사람이 많을 때
            // 제일 빠른 시간에 온 사람이 버스보다 늦게 온 경우 버스 시간을 반환
            if (personQueue.peek().compareTo(busQueue.peek()) > 0) return busQueue.peek().toString();
            else {
                // 빨리 온 크루부터 자리 1자리 남기고 채우기, 먄약 가장 빨리온 크루의 시간이 막차 시간보다 늦다면 버스 시간을 반환
                for (int i = 0; i < m - 1; i++) {
                    if (busQueue.peek().compareTo(personQueue.peek()) >= 0) {
                        personQueue.poll();
                    } else {
                        return busQueue.peek().toString();
                    }
                }
                // 마지막 크루가 버스보다 늦었으면 버스 시간을 반환
                if (busQueue.peek().compareTo(personQueue.peek()) < 0) {
                    return busQueue.peek().toString();
                }
                // 마지막 크루보다 1분 빨리오기
                if (personQueue.peek().minute - 1 < 0) {
                    return (new Time(personQueue.peek().hour - 1, 59).toString());
                } else {
                    return (new Time(personQueue.peek().hour, personQueue.peek().minute - 1).toString());
                }
            }
        }

        return answer;
    }

    static class Time implements Comparable<Time> {
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
}

