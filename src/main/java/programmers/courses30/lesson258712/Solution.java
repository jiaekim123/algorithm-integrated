package programmers.courses30.lesson258712;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712?language=java
 * 코딩테스트 연습
 * 2024 KAKAO WINTER INTERNSHIP
 * 가장 많이 받은 선물
 */
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        return answer;
    }

    class FriendGift {
        private final String name;
        private final Map<String, Integer> giftMap;

        public FriendGift(String name) {
            this.name = name;
            this.giftMap = new HashMap<>();
        }

        public int getGiftCount(String friendName) {
            return giftMap.getOrDefault(friendName, 0);
        }

        public void addGift(String friendName) {
            giftMap.put(friendName, giftMap.getOrDefault(friendName, 0) + 1);
        }
    }
}

