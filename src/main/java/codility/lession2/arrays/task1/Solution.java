/*
    https://app.codility.com/programmers/lessons/1-iterations/
    [Codility][lesson1] Arrays - CyclicRotation
 */

package codility.lession2.arrays.task1;

class Solution {
    public int[] solution(int[] A, int K) {
        int[] answer = A.clone();
        for (int i = 0; i <K; i++){
            answer = rotationOnce(answer, K);
        }
        return answer;
    }

    private int[] rotationOnce(int[] A, int K) {
        if (K == 0) {
            return A;
        } else {
            int[] copyA = new int[A.length];
            for (int i = 0; i < A.length - 1; i++) {
                copyA[i + 1] = A[i];
            }
            copyA[0] = A[A.length - 1];
            return copyA;
        }
    }
}