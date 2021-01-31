/*
    https://programmers.co.kr/learn/courses/30/lessons/42628
    [프로그래머스][힙] 이중우선순위 큐
 */
package programmers.courses30.lesson42628;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    private final static String INSERT_COMMAND = "I";
    private final static String DELETE_COMMAND = "D";
    public int[] solution(String[] operations) {
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> reverseQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String operation : operations) {
            String[] command = operation.split(" ");
            int num = Integer.parseInt(command[1]);
            switch (command[0]) {
                case INSERT_COMMAND:
                    queue.offer(num);
                    reverseQueue.offer(num);
                    break;
                case DELETE_COMMAND:
                    if (queue.size() == 0 || reverseQueue.size() == 0) break;
                    if (num == -1){
                        int min = queue.poll();
                        reverseQueue.remove(min);
                    } else {
                        int max = reverseQueue.poll();
                        queue.remove(max);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + command[0]);
            }

        }

        if (queue.size() == 0 || reverseQueue.size() == 0) return new int[] {0, 0};
        else return new int[] {reverseQueue.peek(), queue.peek()};
    }
}