package hackerrank.callenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(Arrays.asList(11,2,4));
		arr.add(Arrays.asList(4,5,6));
		arr.add(Arrays.asList(10,8,-12));
		System.out.println(diagonalDifference(arr));
	}
	
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int x=0, y=0;
    	for (int i = 0; i<arr.size(); i++) {
    		for (int j = 0; j <arr.size(); j++){ 
    			if (i==j) x+=arr.get(i).get(j);
    		}
    	}
    	
    	for (int i=0; i<arr.size(); i++) {
    		for (int j = arr.size()-1; j >=0; j--){ 
    			if ((i+j)==(arr.size()-1)) y+=arr.get(i).get(j);
    		}
    	}

		return x - y > 0 ? x - y : y - x;
    }
}
