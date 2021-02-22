/*
    https://programmers.co.kr/learn/courses/30/lessons/12924
    [프로그래머스][연습문제] 숫자의 표현
 */
package programmers.courses30.lesson12924;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1 ; i <= n; i++){
            int sum = 0;
            for (int j = i; j <=n; j++){
                sum += j;
                if (sum == n) answer++;
                else if (sum > n) break;
            }
        }
        return answer;
    }
}