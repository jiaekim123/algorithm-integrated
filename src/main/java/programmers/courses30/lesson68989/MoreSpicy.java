package programmers.courses30.lesson68989;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> scovilleQueue = new PriorityQueue<Integer>();
		for (int num : scoville) {
			scovilleQueue.offer(num);
		}

		return mixScovile(scovilleQueue, K);
	}

	private int mixScovile(Queue<Integer> scovilleQueue, int K) {
		int count = 0;
		while (scovilleQueue.peek() <= K) {
			if (scovilleQueue.size() < 2) {
				return -1;
			}
			scovilleQueue.offer(scovilleQueue.poll() + (scovilleQueue.poll() * 2));
			count++;
		}
		return count;
	}
}