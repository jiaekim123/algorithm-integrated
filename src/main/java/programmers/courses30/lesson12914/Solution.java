/*
    https://programmers.co.kr/learn/courses/30/lessons/12914?language=java
    [프로그래머스][연습문제] 멀리뛰기
 */
package programmers.courses30.lesson12914;

class Solution {
    public long solution(int n) {
        return dp(n);
    }

    private int dp(int n) {
        int[] dp = new int[n + 1];
        if (n == 1) return 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }

    private int dfs(int count, int n, int answer) {
        if (count == n) {
            return answer + 1;
        } else if (count > n) {
            return answer;
        }
        return (dfs(count + 1, n, answer) + dfs(count + 2, n, answer)) % 1234567;
    }
}