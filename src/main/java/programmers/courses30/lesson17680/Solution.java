/*
    https://programmers.co.kr/learn/courses/30/lessons/17680
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 1차 캐시
 */
package programmers.courses30.lesson17680;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        if (cacheSize == 0) return cities.length * 5;
        for (String city : cities){
            if (queue.contains(city.toLowerCase())){
                queue.remove(city.toLowerCase());
                queue.offer(city.toLowerCase());
                answer++;
            } else {
                if (queue.size() == cacheSize) queue.poll();
                queue.offer(city.toLowerCase());
                answer += 5;
            }
        }
        return answer;
    }
}