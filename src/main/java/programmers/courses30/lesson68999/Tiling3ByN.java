package programmers.courses30.lesson68999;

class Solution {
	public int solution(int n) {
		if (n % 2 == 1) {
			return 0;
		}

		long[] evenArr = new long[n / 2 + 1];
		evenArr[0] = 1;
		evenArr[1] = 3;

		for (int i = 2; i <= n / 2; i++) {
			evenArr[i] = evenArr[i - 1] * evenArr[1];
			for (int j = 0; j < i - 1; j++) {
				evenArr[i] += evenArr[j] * 2;
			}
			evenArr[i] = evenArr[i] % 1000000007;
		}
		return (int) evenArr[n / 2];
	}
}

public class Tiling3ByN {
	public static void main(String[] args) {

		for (int i = 2; i < 1000; i++) {
			System.out.println(new Solution().solution(i * 2));
		}
	}
}
