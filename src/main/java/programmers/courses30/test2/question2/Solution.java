package programmers.courses30.test2.question2;

import java.util.*;

class Solution {
    public int solution(int n) {
        Queue<Integer> answers = new PriorityQueue<>();
        int[] pows = getPows(n);
        for (int j = 0; j< pows.length; j++) {
            int answer = 0;
            int num = n;
            for (int i = j; i <pows.length; i++) {
                while (num - pows[i] >= 0){
                    num -= pows[i];
                    answer++;
                    if (num == 0) answers.offer(answer);
                }
            }
        }
        return answers.peek();
    }

    private int[] getPows(int n) {
        int sqrt = (int) Math.sqrt(n);
        int[] pows = new int[sqrt];
        for (int i = 0; i < sqrt; i++) {
            pows[i] = (int) Math.pow((sqrt - i), 2);
        }
        return pows;
    }
}