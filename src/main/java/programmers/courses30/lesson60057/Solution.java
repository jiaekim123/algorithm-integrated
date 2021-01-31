/*
    https://programmers.co.kr/learn/courses/30/lessons/60057
    [프로그래머스][2020 KAKAO BLIND RECRUITMENT] 문자열 압축
 */
package programmers.courses30.lesson60057;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        if (s.length() == 1) return 1;
        for (int i = 1; i < s.length(); i++) {
            answer = Math.min(answer, compressWord(s, i));
        }
        return answer;
    }

    private int compressWord(String s, int compress) {
        int length = 0;
        int num = 0;
        char[] charS = s.toCharArray();
        String beforeWord = "";
        int beforeNum = 0;
        while (num<s.length()){
            StringBuilder sb = new StringBuilder();
            for (int j = 0 ; j <compress; j++) {
                if (num > s.length() - 1) break;
                sb.append(charS[num++]);
            }
            if (beforeWord.equals(sb.toString())){
                if (beforeNum == 1 || beforeNum == 9 || beforeNum == 99 || beforeNum == 999){
                    length++;
                }
                beforeNum++;
            } else {
                length += sb.length();
                beforeNum = 1;
            }
            beforeWord = sb.toString();
        }
//        System.out.println( "s: " + s + ",compress : " + compress + "length : " + length);
        return length;
    }
}
