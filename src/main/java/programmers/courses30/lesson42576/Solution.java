/*
    https://programmers.co.kr/learn/courses/30/lessons/42576
    [프로그래머스][해시] 완주하지 못한 선수
 */
package programmers.courses30.lesson42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String player : participant) {
            Integer playerCount = participantMap.getOrDefault(player, 0);
            if (playerCount != 0) {
                participantMap.replace(player, playerCount + 1);
            } else {
                participantMap.put(player, 1);
            }
        }

        for (String player : completion) {
            Integer playerCount = participantMap.getOrDefault(player, 0);
            if (playerCount > 1) {
                participantMap.replace(player, playerCount - 1);
            } else {
                participantMap.remove(player);
            }
        }
        return participantMap.keySet().iterator().next();
    }
}