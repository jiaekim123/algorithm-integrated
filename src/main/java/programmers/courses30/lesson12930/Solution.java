/*
    https://programmers.co.kr/learn/courses/30/lessons/12930
    [프로그래머스][연습문제] 이상한 문자 만들기
 */
package programmers.courses30.lesson12930;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ", -1); // limit -1을 붙여야 마지막 공백 포함

        for (int j = 0; j < strings.length; j++) {
            char[] chars = strings[j].toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) sb.append(Character.toUpperCase(chars[i]));
                else sb.append(Character.toLowerCase(chars[i]));
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}