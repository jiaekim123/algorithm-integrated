package programmers.courses30.lesson68998;

import java.util.Arrays;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] students = new int[n];
		Arrays.fill(students, 1); // 체육복이 하나 있는 상태로 초기화

		// 체육복이 있는 친구와 없는 친구 초기화
		Arrays.stream(reserve).forEach(num -> students[num -1] += 1);
		Arrays.stream(lost).forEach(num -> students[num -1] -= 1);
		
		// 체육복 있는 친구의 나누미 활동
		for (int i = 0; i < n; i++) {
			if (students[i] > 0) {
				continue;
			}
			if (i > 0 && students[i - 1] > 1) {
				students[i - 1] -= 1;
				students[i] += 1;
			}
			if (i < n - 1 && students[i + 1] > 1) {
				students[i + 1] -= 1;
				students[i] += 1;
			}
		}
		
		return (int) Arrays.stream(students).filter(i -> i > 0).count();
	}
}

public class SweatSuit {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
		System.out.println(new Solution().solution(5, new int[] { 2, 4 }, new int[] { 3 }));
		System.out.println(new Solution().solution(3, new int[] { 3 }, new int[] { 1 }));
		System.out.println(new Solution().solution(2, new int[] { 1, 2 }, new int[] { 1 }));
		System.out.println(new Solution().solution(4, new int[] { 1, 3 }, new int[] { 2 }));
	}

}
