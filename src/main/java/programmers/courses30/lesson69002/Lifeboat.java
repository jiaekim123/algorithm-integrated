package programmers.courses30.lesson69002;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
	public int solution(int[] people, int limit) {
		return getAnswerArray(people, limit);
	}
	private int getAnswerArray(int[] people, int limit){
		int count = 0;
		Arrays.sort(people);
		
		int num = 0;
		while (count + num < people.length) {
			int total = people[people.length-count-1];
			for (int i = num; i < people.length-count; num++) {
				if (total + people[i] > limit) break;
				total += people[i];
			}
			count++;
		}
		
		return count;
	}
	private int getAnswerLinkedList(int[] people, int limit) {
		int count = 0;
		List<Integer> weightList = new LinkedList<>();
		for (int weight : people) {
			weightList.add(weight);
		}
		
		Collections.sort(weightList, Collections.reverseOrder());
		
		while (!weightList.isEmpty()) {
			int total = weightList.remove(0);
			
			for (int i = weightList.size()-1 ; i >= 0; i--) {
				if (total + weightList.get(i) > limit) break;
				total += weightList.remove(i);
			}
			count++;
		}
		return count;		
	}
}

public class Lifeboat {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] { 70, 50, 80, 50 }, 100));
		System.out.println(new Solution().solution(new int[] { 70, 50, 80 }, 100));
	}
}
