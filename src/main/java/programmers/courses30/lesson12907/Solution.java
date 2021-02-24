/*
    https://programmers.co.kr/learn/courses/30/lessons/12907
    [프로그래머스][연습문제] 거스름돈 - DP문제
 */
package programmers.courses30.lesson12907;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] money) {
        long[] dp = new long[n+1];
        Arrays.sort(money);

        // 화폐 한개로 지불할 수 있는 방법
        for (int i = 0; i <= n; i++){
            if (i % money[0] == 0) dp[i] = 1;
        }

        // 화폐 단위 개수 별로 반복문을 돈다.
        for (int i = 1; i < money.length; i++){
            for (int j = money[i]; j<=n; j++){
                dp[j] += dp[j - money[i]]; // 화폐 이전까지의 합 + 새로운 화폐로 만들 수 있는 방법
            }
        }

        return (int)(dp[n] % 1000000007);
    }
}