/*
    https://programmers.co.kr/learn/courses/30/lessons/12917
    [프로그래머스][연습문제] 문자열 내림차순 배치
 */
package programmers.courses30.lesson12917;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder();
        sb.append(charArray).reverse();
        return sb.toString();
    }
}