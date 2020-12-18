package programmers.courses30.lesson12899;

class Solution {
	public String solution(int n) {
		int[] nums = { 4, 1, 2 };
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			int remain = n % 3;
			n /= 3;
			if (remain == 0) {
				n--;
			}
			sb.insert(0, nums[remain]);
		}
		return sb.toString();
	}
}

public class ContryOf124 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(new Solution().solution(i));
		}
	}
}
