package programmers.courses30.lesson68983;

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

public class DevelopFunction {
	public static void main(String[] args) {
		int[] answers = new Solution().solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 });
		for (int answer : answers) {
			System.out.print(answer + " ");
		}
		
		int[] answers2 = new Solution().solution(new int[] { 95, 90, 99, 99, 80, 99 }, new int[] { 1, 1, 1, 1, 1, 1 });
		for (int answer : answers2) {
			System.out.print(answer + " ");
		}
	}
}
