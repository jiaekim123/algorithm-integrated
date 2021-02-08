/*
    https://programmers.co.kr/learn/courses/30/lessons/42586
    [프로그래머스][스택/큐] 기능개발
 */
package programmers.courses30.lesson42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    private static final int PROGRESS = 0;
    private static final int SPEED = 1;

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<Integer>();
        Queue<Integer[]> developQueue = new LinkedList<Integer[]>();
        for (int i = 0; i < progresses.length; i++) {
            developQueue.offer(new Integer[] { progresses[i], speeds[i] });
        }

        for (int day = 1;!developQueue.isEmpty(); day++) {
            int distributeNum = 0;
            while (!developQueue.isEmpty()
                    && day * developQueue.peek()[SPEED] >= (100 - developQueue.peek()[PROGRESS])) {
                developQueue.poll();
                distributeNum++;
            }
            if (distributeNum > 0) {
                answerList.add(distributeNum);
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}