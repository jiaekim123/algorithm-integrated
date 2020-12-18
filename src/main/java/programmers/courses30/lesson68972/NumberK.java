package programmers.courses30.lesson68972;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
        
    	for (int i = 0; i<commands.length; i++) {
        	int[] intArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(intArr);
        	answer[i] = intArr[commands[i][2]-1];
        }

    	return answer;
    }
}

public class NumberK {
	public static void main(String[] args) {
		int[] answer = new Solution().solution(new int[] {1, 5, 2, 6, 3, 7, 4}, 
				new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
		for (int num : answer) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
