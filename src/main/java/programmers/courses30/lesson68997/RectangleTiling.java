package programmers.courses30.lesson68997;

class Solution {
    public int solution(int n) {
        int[] answerArr = new int[n];
        answerArr[0] = 1;
        answerArr[1] = 2;
        for (int i = 2; i<n; i++) {
        	answerArr[i] = (answerArr[i-1] + answerArr[i-2]) % 1000000007;
        }
        return answerArr[n-1];
    }
}

public class RectangleTiling {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(4));
	}

}
