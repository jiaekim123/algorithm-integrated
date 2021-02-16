/*
    https://programmers.co.kr/learn/courses/30/lessons/42576
    [프로그래머스][해시] 완주하지 못한 선수
 */
package programmers.courses30.lesson42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>(participant.length);
        for (String player : participant) {
            participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            participantMap.put(player, participantMap.get(player) - 1);
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) == 1) return key;
        }
        return "invalid";
    }
}