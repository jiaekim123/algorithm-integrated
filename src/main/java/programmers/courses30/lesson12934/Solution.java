/*
    https://programmers.co.kr/learn/courses/30/lessons/12934
    [프로그래머스][연습문제] 정수 제곱근 판별
 */
package programmers.courses30.lesson12934;

class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if (num % 1 != 0) return -1;
        else return (long)Math.pow(num + 1, 2);
    }
}