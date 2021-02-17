/*
    https://programmers.co.kr/learn/courses/30/lessons/12905
    [프로그래머스][연습문제] 가장 큰 정사각형 찾기
 */
package programmers.courses30.lesson12905;

import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] maxBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        int num = Arrays.stream(new int[]{maxBoard[i - 1][j], maxBoard[i - 1][j - 1], maxBoard[i][j - 1]}).min().getAsInt() + 1;
                        answer = Math.max(num, answer);
                        maxBoard[i][j] = num;
                    } else {
                        maxBoard[i][j] = 1;
                        answer = Math.max(1, answer);
                    }
                } else {
                    maxBoard[i][j] = 0;
                }
            }
        }

        return (int) Math.pow(answer, 2);
    }
}