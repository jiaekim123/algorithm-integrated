/*
    https://programmers.co.kr/learn/courses/30/lessons/12931
    [프로그래머스][연습문제] 자릿 수 더하기
 */
package programmers.courses30.lesson12931;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 타입변환 방식.
        char[] arr = String.valueOf(n).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(String.valueOf(arr[i]));
        }
        // 나누기와 나머지 방식

//        while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }

        return answer;
    }
}