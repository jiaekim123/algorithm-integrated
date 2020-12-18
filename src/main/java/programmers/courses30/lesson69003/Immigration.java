package programmers.courses30.lesson69003;
/**
 * https://school.programmers.co.kr/courses/10824/lessons/69003
 * 입국심사 - 이분탐색 문제
 */
import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
    	Arrays.sort(times);
    	
    	long right = (long) n * times[times.length-1]; // 가장 시간이 오래 걸리는 심사원이 n명을 모두 심사했을 때 걸리는 시간
    	long left = 1;
    	long answer = right;
    	
    	while (left <= right) {
    		long middle = (left + right) / 2; // 가장 오래 걸리는 시간과 적게 걸리는 시간의 중간 값
    		long person = 0; // 전체 심사원이 심사할 수 있는 인원 수
			for (int time : times) {
				person += middle / time; // 한 심사원이 심사 할 수 있는 인원 수
			}
			
			if (person >= n){
				if (middle < answer) answer = middle;
				right = middle - 1;
			} else {
				left = middle + 1;
			}
    	}
        return answer;
    }
}

public class Immigration {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(6, new int[] {7, 10}));
	}

}
