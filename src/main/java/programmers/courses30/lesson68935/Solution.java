/*
    https://programmers.co.kr/learn/courses/30/lessons/68935
    [프로그래머스][월간 코드 챌린지 시즌1] 3진법 뒤집기
 */
package programmers.courses30.lesson68935;

class Solution {
    public int solution(int n) {
        // 10진법 -> 3진법
        StringBuilder sb = new StringBuilder();
        while (n / 3 != 0){
            sb.append(n % 3);
            n /= 3;
        }
        sb.append(n % 3);

        // 3진법 -> 10진법
        return Integer.parseInt(sb.toString(), 3);
    }
}