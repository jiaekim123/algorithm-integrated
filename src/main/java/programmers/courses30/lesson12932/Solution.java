/*
    https://programmers.co.kr/learn/courses/30/lessons/12932
    [프로그래머스][연습문제] 자연스 뒤집어 배열로 만들기
 */
package programmers.courses30.lesson12932;

class Solution {
    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] answer = new int[chars.length];
        for (int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(String.valueOf(chars[chars.length - 1 - i]));
        }
        return answer;
    }
}