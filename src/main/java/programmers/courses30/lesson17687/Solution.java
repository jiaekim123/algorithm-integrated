/*
    https://programmers.co.kr/learn/courses/30/lessons/17687
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] [3차] n진수 게임 (level 2)
 */
package programmers.courses30.lesson17687;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder(t);

        // 배열에 전체 답을 넣는다.
        char[] totalAnswer = getTotalAnswer(n, t, m).toCharArray();

        // for문을 돌면서 m으로 나눈 나머지가 p-1인 값을 answer Stringbuilder에 append한다.
        for (int i = 0; i <totalAnswer.length; i++){
            if ( i % m == p-1) answer.append(totalAnswer[i]);
        }

        return answer.toString();
    }
    private String getTotalAnswer(int n, int t, int m){
        char[] totalNumbers = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] numbers = Arrays.copyOfRange(totalNumbers, 0, n);

        StringBuilder totalAnswer = new StringBuilder(t * m);
        int i = 0;
        int num = 0;
        while (i < t * m){
            String nums = getNumString(num, n, numbers);
            totalAnswer.append(nums);
            i += nums.length();
            num++;
        }

        return totalAnswer.toString().substring(0, t * m);
    }

    private String getNumString(int num, int n, char[] numbers){
        int j = num;
        if (j == 0){
            return String.valueOf(numbers[0]);
        }
        Stack<Character> stack = new Stack();
        while (j > 0){
            stack.add(numbers[j % n]);
            j = j/n;
        }
        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}