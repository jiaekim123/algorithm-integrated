/*
    https://programmers.co.kr/learn/courses/30/lessons/12904
    [프로그래머스][연습문제] 가장 긴 팰린드롬
 */
package programmers.courses30.lesson12904;

class Solution {
    public static int solution(String s) {
        int answer = 1;
        int len = s.length();
        char[] a = s.toCharArray();
        // 방법1. (완전탐색) isPalindrome 메서드를 만들고, 짝수/홀수 팰린드별로 모든 부분문자열에 대해 탐색한다.
        // 방법2. (DP) 어떤 중심 문자열을 정하고, 해당 문자열의 최대 팰린드 길이를 배열에 저장한다.
        int[][] dp = new int[len][len];

        // 1까지 - dp 초기화 1로
        for (int i = 0; i < len; i++)
            dp[i][i] = 1;

        // 2까지 - (왼쪽부터 돌 꺼니까) 오른쪽에 값이 기준 값과 동일하면 길이는 2
        for (int i = 0; i < len-1; i++) {
            if( a[i] == a[i+1] ) {
                dp[i][i + 1] = 1;
                answer = 2;
            }
        }
        // 3이상 - 가운데 문자열 기준으로 k만큼 떨어져있다고 할 경우
        for (int k = 3; k <= len; k++) {
            for (int i = 0; i <= len-k ; i++) {
                int j = i+k-1; // k길이 만큼 떨어진 index
                if( a[i] == a[j] && dp[i+1][j-1] == 1 ) { // 문자열이 같고, [i-1][j+1] 가 팰린드롬이라면
                    dp[i][j] = 1;
                    answer = Math.max(answer,k);
                }
            }
        }

        return answer;
    }
}