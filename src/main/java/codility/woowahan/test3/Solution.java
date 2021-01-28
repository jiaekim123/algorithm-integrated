package codility.woowahan.test3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        // Create PriorityQueue that stores positive and negative numbers separately.
        // O(N)
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> oppositeQueue = new PriorityQueue<>();
        for (int num : A){
            if (num > 0) queue.offer(num);
            else if (num < 0) oppositeQueue.offer(num);
        }

        // worst case: O(N^)
        while (!queue.isEmpty()) {
            // Poll the largest value of the positive queue and put into K.
            int K = queue.poll();
            while (!oppositeQueue.isEmpty()){
                // If the smallest value is taken from the negative queue and it is equal to -K, K is returned.
                if (oppositeQueue.peek() == -K){
                    return K;
                }
                // If the smallest value in the negative queue is greater than -K, the loop is exited.
                else if (oppositeQueue.peek() > -K){
                    break;
                }
                // If the smallest value in the negative queue is less than -K, poll and repeat again.
                else if (oppositeQueue.peek() < -K){
                    oppositeQueue.poll();
                }
            }
        }
        return answer;
    }
}