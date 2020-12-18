package programmers.courses30.lesson68971;

import java.util.ArrayList;
import java.util.List;

class Solution {
	private final int LENGTH = 3;
    public int solution(int[] nums) {
        int answer = 0;
        
        List<int[]> numList = getNumList(nums);
        for (int[] numArr : numList) {
        	if (isPrimeNum(sumArr(numArr))) answer++;
        }
        
        return answer;
    }
    private List<int[]> getNumList(int[] nums) {
    	List<int[]> numList = new ArrayList<int[]>();
    	boolean[] visited = new boolean[nums.length];
    	combination(nums, visited, 0, nums.length, LENGTH, numList);
    	return numList;
    }
    private int sumArr(int[] numArr) {
    	int sum = 0;
    	for (int num: numArr) {
    		sum += num;
    	}
    	return sum;
    }
    private boolean isPrimeNum(int num) {
    	if (num == 0 || num == 1) return false;
    	else if (num == 2) return true;
    	
    	for (int i=2; i<num; i++) {
    		if(num%i==0) return false;
    	}
    	
    	return true;
    }
    
    private void combination(int[] nums, boolean[] visited, int start, int n, int r, List<int[]> numList) {
    	if (r == 0) {
    		int[] numArr = makeNumberArr(visited, nums, n);
    		numList.add(numArr);
    		return;
    	}
    	
		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(nums, visited, i+1, n, r-1, numList);
			visited[i] = false;
    	}
    }
    
    private int[] makeNumberArr(boolean[] visited, int[] nums, int n) {
		int count = 0;
		int[] numArr = new int[LENGTH];
		for (int i = 0; i<n; i++) {
			if (visited[i]) {
				numArr[count] = nums[i];
    			count++;
			}
		}
		return numArr;
    }
}

public class MinorityNum {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] {1,2,3,4}));
		System.out.println(new Solution().solution(new int[] {1,2,7,6,4}));
	}

}
