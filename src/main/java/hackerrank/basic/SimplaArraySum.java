package hackerrank.basic;

public class SimplaArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int answer = 0;
        for (int num : ar) {
        	answer += num;
        }
    	return answer;
    }
	public static void main(String[] args) {
		System.out.println(simpleArraySum(new int[] {1,2,3,4,10,11}));
	}

}
