/*
    https://programmers.co.kr/learn/courses/30/lessons/12951
    [프로그래머스][연습문제] JadenCase 문자열 만들기
 */
package programmers.courses30.lesson12951;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}