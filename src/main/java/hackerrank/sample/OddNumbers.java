package hackerrank.sample;


import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) {
    	List<Integer> answer = new ArrayList<Integer>();
    	for (int i =l; i<=r; i++) {
    		if (i%2!=0) answer.add(i);
    	}
    	return answer;
    }

}

public class OddNumbers {
	public static void main(String[] args) {
		Result result = new Result();
		System.out.println(result.oddNumbers(2, 5));
	}
}
