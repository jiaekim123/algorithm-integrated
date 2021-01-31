/*
    https://programmers.co.kr/learn/courses/30/lessons/64061
    [프로그래머스][2019 카카오 개발자 겨울 인턴십] 크레인 인형뽑기 게임
 */
package programmers.courses30.lesson64061;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Queue<Integer> moveQueue = new LinkedList<>();
        Stack<Integer> basket = new Stack<>();
        for (int move : moves){
            moveQueue.offer(move);
        }
        while (!moveQueue.isEmpty()){
            int col = moveQueue.poll();
            int row = 0;
            for (int i = 0; i<board[0].length; i++){
                if (board[i][col-1] != 0){
                    row = board[i][col-1];
                    board[i][col-1] = 0;
                    if (!basket.isEmpty() && basket.peek()==row){
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(row);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}