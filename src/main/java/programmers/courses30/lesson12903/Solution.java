/*
    https://programmers.co.kr/learn/courses/30/lessons/12903
    [프로그래머스][연습문제] 가운데 글자 가져오기
 */
package programmers.courses30.lesson12903;

class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 1) {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        return answer;
    }
}