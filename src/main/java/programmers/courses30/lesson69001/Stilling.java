package programmers.courses30.lesson69001;

class Solution {
	public int solution(int[] money) {
		return Math.max(dp(money, money[0], money[0], money.length - 1), dp(money, 0, money[1], money.length));
	}
    
    public int dp(int[] money, int first, int second, int last) {
    	int max[] = new int[money.length];
    	max[0] = first;
    	max[1] = second;
    	for (int i = 2; i < last; i++) {
    		max[i] = Math.max(max[i-1], max[i-2] + money[i]);
    	}
    	return max[last-1];    	
    }
}

public class Stilling {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[]{1,2,3,1}));
	}
}
