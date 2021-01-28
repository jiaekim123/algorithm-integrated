package codility.never.test2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] P, int[] S) {
        int answer = 0;

        // sort big to small using priority queue
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int car : S){
            queue.offer(car);
        }

        // get total number of people
        int totalP = 0;
        for (int people : P){
            totalP += people;
        }

        // insert people to car
        while (totalP > 0){
            int seats = queue.poll();
            if (totalP - seats <= 0) break;
            totalP -= seats;
        }

        // total car count - unused car
        return S.length - queue.size();
    }
}
