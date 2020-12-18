package hackerrank.sample;

import java.util.List;

class Result2 {

    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static String findNumber(List<Integer> arr, int k) {
    	String answer = "NO";
    	for (int num : arr) {
    		if (num == k) {
    			answer = "YES";
    			return answer;
    		}
    	}
    	return answer;
    }

}
public class FindTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
