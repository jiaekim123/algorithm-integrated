/*
    https://app.codility.com/programmers/lessons/7-stacks_and_queues/
    [Codility][Stack] Brackets
 */
package codility.lesson.lesson7.stack.brackets;

import java.util.Stack;

class Solution {
    public int solution(String S) {
        final int NESTED = 1;
        final int NOT_NESTED = 0;
        if (S.length() % 2 != 0) return NOT_NESTED;
        char[] charArr = S.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char N : charArr){
            if (N == '{' || N == '[' || N == '(') stack.push(N);
            else {
                if (stack.empty()) return NOT_NESTED;
                if (N == '}') {
                    if (stack.pop() != '{') return NOT_NESTED;
                } else if (N == ']') {
                    if (stack.pop() != '[') return NOT_NESTED;
                } else if (N == ')') {
                    if (stack.pop() != '(') return NOT_NESTED;
                }
            }
        }
        if (stack.empty()) return NESTED;
        return NOT_NESTED;
    }
}