/*
    https://programmers.co.kr/learn/courses/30/lessons/12954
    [프로그래머스][연습문제] x만큼 간격이 있는 n개의 숫자
 */
package programmers.courses30.lesson12954;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)(i + 1) * (long)x;
        }
        return answer;
    }
}
