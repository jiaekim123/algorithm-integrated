/*
    https://programmers.co.kr/learn/courses/30/lessons/12944
    [프로그래머스][연습문제] 평균 구하기
 */
package programmers.courses30.lesson12944;

import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}