package codility.lesson.lesson3.tapeequilibrium;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int answer = Integer.MAX_VALUE;
        int sum = Arrays.stream(A).sum();
        for (int i = 0; i < A.length; i++) {
            int firstBlock = 0;
            for (int j = 0; j <= i; j++) {
                firstBlock += A[j];
            }
            int secondBlock = sum - firstBlock;
            answer = Math.min(answer, Math.abs(secondBlock - firstBlock));
        }

        return answer;
    }
}
