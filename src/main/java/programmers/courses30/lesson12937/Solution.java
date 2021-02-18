/*
    https://programmers.co.kr/learn/courses/30/lessons/12937
    [프로그래머스][연습문제] 짝수와 홀수
 */
package programmers.courses30.lesson12937;

class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}