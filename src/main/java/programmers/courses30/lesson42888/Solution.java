/*
    https://programmers.co.kr/learn/courses/30/lessons/42888
    [프로그래머스][2019 KAKAO BLIND RECRUITMENT] 오픈채팅방 (level 2)
 */
package programmers.courses30.lesson42888;

import java.util.*;

class Solution {
    private final static String ENTER = "Enter";
    private final static String LEAVE = "Leave";
    private final static String CHANGE = "Change";

    public String[] solution(String[] record) {
        List<String> answerList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        String[] actives = new String[record.length];
        String[] ids = new String[record.length];
        String[] names = new String[record.length];

        for (int i = 0; i < record.length; i++) {
            if (record[i].split(" ").length == 3) {
                String active = record[i].split(" ")[0];
                String id = record[i].split(" ")[1];
                String name = record[i].split(" ")[2];
                switch (active) {
                    case ENTER:
                        map.put(id, name);
                        break;

                    case CHANGE:
                        map.replace(id, name);
                        break;
                }
            }
        }

        for (int i = 0; i < record.length; i++) {
            String active = record[i].split(" ")[0];
            String id = record[i].split(" ")[1];
            switch (active) {
                case ENTER:
                    answerList.add(map.get(id) + "님이 들어왔습니다.");
                    break;
                case LEAVE:
                    answerList.add(map.get(id) + "님이 나갔습니다.");
                    break;
            }
        }
        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}