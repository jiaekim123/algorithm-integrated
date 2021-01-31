/*
    https://programmers.co.kr/learn/courses/30/lessons/12922
    [프로그래머스][연습문제] 수박
 */
package programmers.courses30.lesson12922;

class Solution {
    public String solution(int n) {
        final int LENGTH = 2;
        String[] pattern = {"수", "박"};
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++){
            if(i % LENGTH == 0) sb.append(pattern[0]);
            else sb.append(pattern[1]);
        }
        return sb.toString();
    }
}