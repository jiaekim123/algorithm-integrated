/*
    https://programmers.co.kr/learn/courses/30/lessons/42587
    [프로그래머스][스택/큐] 프린터
 */
package programmers.courses30.lesson42587;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Priority> priorityQueue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.offer(new Priority(i, priorities[i]));
        }

        while (priorityQueue.size() != 0) {
            boolean flag = true; // 최대 값인지 확인하는 플래그
            int value = priorityQueue.peek().prior;
            for (Priority priority : priorityQueue) {
                if(value < priority.prior) flag = false; // 기준값보다 큰 수가 존재한다면 flag를 false로 바꿈
            }
            if(!flag) { // 기준값 보다 큰 경우에는 큐에서 빼서 맨 뒤로 넣음.
                priorityQueue.offer(priorityQueue.poll());
            } else {
                if (location == priorityQueue.peek().location) {
                    return answer;
                }
                priorityQueue.poll();
                answer++;
            }
        }
        return answer;
    }
}

class Priority{
    int location;
    int prior;

    Priority(int location, int prior){
        this.location = location;
        this.prior = prior;
    }

}