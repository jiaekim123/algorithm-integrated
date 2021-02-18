/*
    https://programmers.co.kr/learn/courses/30/lessons/12943
    [프로그래머스][연습문제] 콜라츠 추측
 */
package programmers.courses30.lesson12943;

class Solution {
    public int solution(int num) {
        int answer = 0;
        long numL = num;
        while (numL != 1){
            if (answer == 500) return -1;
            // 1-1. 입력된 수가 짝수라면 2로 나눕니다.
            if (numL % 2 == 0) numL = numL / 2;
            // 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
            else numL = numL * 3 + 1;

            answer++;
        }
        return answer;
    }
}