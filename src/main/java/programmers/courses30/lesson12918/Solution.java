/*
    https://programmers.co.kr/learn/courses/30/lessons/12918
    [프로그래머스][연습문제] 문자열 다루기 기본
 */
package programmers.courses30.lesson12918;

class Solution {
    public boolean solution(String s) {
        return  s.matches("([0-9]{4})") || s.matches("([0-9]{6})");
    }
}