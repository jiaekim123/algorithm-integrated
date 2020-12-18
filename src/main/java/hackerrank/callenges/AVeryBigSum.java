package hackerrank.callenges;


public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(aVeryBigSum(new long[] {100000001, 100000002}));
	}
	
	 // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long sum = 0;
    	for (long num : ar) {
    		sum += num;
    	}

    	return sum;
    }
}
