/*
    https://programmers.co.kr/learn/courses/30/lessons/42748
    [프로그래머스][정렬] K번째수
 */
package programmers.courses30.lesson42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i<commands.length; i++) {
            int[] intArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(intArr);
            answer[i] = intArr[commands[i][2]-1];
        }

        return answer;
    }
}