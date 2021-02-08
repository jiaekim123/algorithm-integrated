/*
    https://programmers.co.kr/learn/courses/30/lessons/42578
    [프로그래머스][해시] 위장
 */
package programmers.courses30.lesson42578;

import java.util.HashMap;

class Solution {
    private static final int CLOTHES_TYPE = 1;

    public int solution(String[][] clothes) {
        int answer = 1;

        // Hashmap<종류, 갯수>
        HashMap<String, Integer> clothesHashMap = new HashMap<>();
        for (String[] clothe : clothes) {
            int clothesCount = clothesHashMap.getOrDefault(clothe[CLOTHES_TYPE], 0);
            if (clothesCount == 0) {
                clothesHashMap.put(clothe[CLOTHES_TYPE], 1);
            } else {
                clothesHashMap.replace(clothe[CLOTHES_TYPE], clothesCount + 1);
            }
        }
        for (Integer value : clothesHashMap.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }
}