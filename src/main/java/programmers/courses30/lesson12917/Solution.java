/*
    https://programmers.co.kr/learn/courses/30/lessons/12917
    [프로그래머스][연습문제] 문자열 내림차순 배치
 */
package programmers.courses30.lesson12917;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        Character[] charArray = boxing(s.toCharArray());
        Arrays.sort(charArray, Collections.reverseOrder());
        return String.valueOf(unBoxing(charArray));
    }
    private Character[] boxing(char[] arr){
        Character[] charArr = new Character[arr.length];
        for (int i = 0; i<arr.length; i++){
            charArr[i] = arr[i];
        }
        return charArr;
    }

    private char[] unBoxing(Character[] arr){
        char[] charArr = new char[arr.length];
        for (int i = 0; i<arr.length; i++){
            charArr[i] = arr[i];
        }
        return charArr;
    }
}