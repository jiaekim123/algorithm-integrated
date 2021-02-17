/*
    https://programmers.co.kr/learn/courses/30/lessons/12933
    [프로그래머스][연습문제] 정수 내림차순으로 배치하기
 */
package programmers.courses30.lesson12933;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        return Long.parseLong(sb.append(arr).reverse().toString());
    }
}