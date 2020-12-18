package programmers.courses30.lesson68992;

class Solution {
	public int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
	}

	public int dfs(int[] numbers, int target, int sum, int depth) {
		if (depth == numbers.length) {
			return (sum == target) ? 1 : 0;
		} else {
			return dfs(numbers, target, sum + numbers[depth], depth + 1)
					+ dfs(numbers, target, sum - numbers[depth], depth + 1);
		}
	}
}

public class TargetNumber {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] { 1, 1, 1, 1, 1 }, 3));
	}
}