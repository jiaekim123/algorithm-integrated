/*
    https://programmers.co.kr/learn/courses/30/lessons/12921
    [프로그래머스][연습문제] 소수 찾기
 */
package programmers.courses30.lesson12921;

class Solution {
    private static int IS_NOT_PRIME = -1;
    private static int UN_CHECKED = 0;
    public int solution(int n) {
        int answer = 0;
        int[] isPrime = new int[n+1];
        isPrime[0] = IS_NOT_PRIME;
        isPrime[1] = IS_NOT_PRIME;
        for (int i = 2; i<= n; i++){
            if (isPrime[i] == UN_CHECKED){
                answer++;
                for (int j = 2; j * i <= n; j++){
                    isPrime[j * i] = IS_NOT_PRIME;
                }
            }
        }
        return answer;
    }

}