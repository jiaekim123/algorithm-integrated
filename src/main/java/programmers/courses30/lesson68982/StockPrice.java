package programmers.courses30.lesson68982;

class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}
		return answer;
	}
}

public class StockPrice {
	public static void main(String[] args) {
		for (int price : new Solution().solution(new int[] { 1, 2, 3, 2, 3 })) {
			System.out.print(price + " ");
		}
	}
}
