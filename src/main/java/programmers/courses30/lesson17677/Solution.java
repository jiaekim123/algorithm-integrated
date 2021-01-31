/*
    https://programmers.co.kr/learn/courses/30/lessons/17677
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 뉴스 클러스터링 (level 2)
 */
package programmers.courses30.lesson17677;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        final double MUL_NUM = 65536;
        StringMap strMap1 = new StringMap(str1);
        StringMap strMap2 = new StringMap(str2);

        int sameCount = strMap1.getSameCount(strMap2);
        int allCount = strMap1.count + strMap2.count - sameCount;

        if (sameCount == 0 && allCount == 0) return 1 * (int) MUL_NUM;
        return (int) ((double) sameCount / (double) allCount * MUL_NUM);
    }
}

class StringMap {
    Map<String, Integer> strMap;
    int count;

    public StringMap(String str) {
        this.strMap = new HashMap<>();
        this.count = 0;
        setHashMap(str);
        setCount();
    }

    private void setHashMap(String str) {
        final String PATTERN = "^[a-zA-Z]*$"; // 영문자 패턴

        // 모든 글자를 다중집합의 원소로 만든다.
        for (int i = 0; i < str.length() - 1; i++) {
            String element = str.substring(i, i + 2).toUpperCase();
            if (Pattern.matches(PATTERN, element)) {
                if (!strMap.containsKey(element)) {
                    strMap.put(element, 1);
                } else {
                    strMap.replace(element, strMap.get(element) + 1);
                }
            }
        }
    }

    public int getSameCount(StringMap strMapComp) {
        int sameCount = 0; // 교집합
        for (String element : strMap.keySet()) {
            if (strMapComp.getMap().containsKey(element)) {
                sameCount += Math.min(strMap.get(element), strMapComp.getMap().get(element));
            }
        }
        return sameCount;
    }

    private void setCount() {
        for (int num : strMap.values()) {
            this.count += num;
        }
    }

    private Map<String, Integer> getMap() {
        return strMap;
    }

    private int getCount() {
        return count;
    }

}