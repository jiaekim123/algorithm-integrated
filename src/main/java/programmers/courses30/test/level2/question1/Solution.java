package programmers.courses30.test.level2.question1;

import java.util.Stack;

class Solution {
    private final int SUCCESS = 1;
    private final int FAIL = 0;
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        Character[] chars = new Character[s.length()];
        for (int i = 0; i <s.length(); i++){
            if (stack.empty() || stack.peek() != chars[i]){
                stack.push(chars[i]);
            } else if (stack.peek() == chars[i]){
                stack.pop();
            }
        }
        if (stack.empty()) return SUCCESS;
        return FAIL;
    }
}