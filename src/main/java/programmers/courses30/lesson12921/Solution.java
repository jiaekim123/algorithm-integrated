/*
    https://programmers.co.kr/learn/courses/30/lessons/12921
    [프로그래머스][연습문제] 소수 찾기
 */
package programmers.courses30.lesson12921;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i<= n; i++){
            if (isPrimary(i)) answer++;
        }
        return answer;
    }

    private boolean isPrimary(int n){
        if (n == 1) return false;
        for (int i = 2; i< n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

}