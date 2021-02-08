/*
    https://programmers.co.kr/learn/courses/30/lessons/42746
    [프로그래머스][정렬] 가장 큰 수
 */
package programmers.courses30.lesson42746;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        // 1. string array에 int[] 넣기
        List<String> numList = new ArrayList<String>();
        for(int num : numbers) {
            numList.add(String.valueOf(num));
        }

        // 2. 내림차순 정리하기
        Collections.sort(numList, new Descending());

        // 3. 중복 숫자 제거하기
        for (String strNum : numList) {
            answer += strNum;
        }

        while ((answer.startsWith("0") && (answer.length()!=1))) {
            answer = answer.substring(1);
        }

        return answer;
    }
}

class Descending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o2+o1).compareTo(o1+o2);
    }

}