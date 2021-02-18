/*
    https://programmers.co.kr/learn/courses/30/lessons/12948
    [프로그래머스][연습문제] 핸드폰 번호 가리기
 */
package programmers.courses30.lesson12948;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<phone_number.length()-4; i++) sb.append("*");
        sb.append(phone_number, phone_number.length()-4, phone_number.length());

        return sb.toString();
    }
}