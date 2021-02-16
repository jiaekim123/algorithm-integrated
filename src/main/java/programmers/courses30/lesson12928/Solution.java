/*
    https://programmers.co.kr/learn/courses/30/lessons/12928
    [프로그래머스][연습문제] 약수의 합
 */
package programmers.courses30.lesson12928;

class Solution {
    public int solution(int n) {
        int answer = n; // n 본인도 약수
        for (int i = 1; i <= n/2; i++){
            if (n % i == 0) answer+= i;
        }
        return answer;
    }
}