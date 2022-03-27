package programmers.courses30.lesson12973;

import java.util.Stack;

/**
 * 설명 : https://programmers.co.kr/learn/courses/30/lessons/12973
 * <p>
 * 코딩테스트 연습
 * 2017 팁스타운
 * 짝지어 제거하기
 */
class Solution {
    public int solution(String s) {
        char[] alphabets = s.toCharArray();
        Stack<Character> alphabetStack = new Stack<>();
        for (Character alphabet : alphabets) {
            if (alphabetStack.isEmpty()) {
                alphabetStack.push(alphabet);
                continue;
            }
            if (alphabetStack.peek().equals(alphabet)) {
                alphabetStack.pop();
            } else {
                alphabetStack.push(alphabet);
            }
        }
        return alphabetStack.isEmpty() ? 1 : 0;
    }
}