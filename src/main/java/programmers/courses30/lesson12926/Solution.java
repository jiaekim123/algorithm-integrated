/*
    https://programmers.co.kr/learn/courses/30/lessons/12926
    [프로그래머스][연습문제] 시저 암호
 */
package programmers.courses30.lesson12926;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        // A: 65, Z: 90, a: 97, z: 122
        char[] chars = s.toCharArray();
        for (char c : chars){
            if(Character.isAlphabetic(c)){
                // 대문자
                if (c >= 65 && c <= 90){
                    if (c + n > 90) sb.append((char)(c + n - 26));
                    else sb.append((char)(c + n));
                }
                // 소문자
                if (c >= 97 && c <= 122){
                    if (c + n > 122) sb.append((char)(c + n - 26));
                    else sb.append((char)(c + n));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}