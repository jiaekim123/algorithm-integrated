/*
    https://programmers.co.kr/learn/courses/30/lessons/12941
    [프로그래머스][연습문제] 최솟값 만들기
 */
package programmers.courses30.lesson12941;

import java.util.Arrays;

class Solution{
    public int solution(int[] A, int[] B)    {
        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;
        int answer = 0;

        for (int i = 0; i < length; i++) {
            answer += A[i] * B[length - 1 - i];
        }

        return answer;
    }
}
// boxing, unBoxing 쓰지 말고 풀기
//class Solution {
//    public int solution(int[] A, int[] B) {
//        int answer = 0;
//        Integer[] boxingB = boxing(B);
//        Arrays.sort(A);
//        Arrays.sort(boxingB, Collections.reverseOrder());
//        for (int i = 0; i < A.length; i++) {
//            answer += A[i] * boxingB[i];
//        }
//        return answer;
//    }
//
//    private Integer[] boxing(int[] arr) {
//        Integer[] boxing = new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            boxing[i] = arr[i];
//        }
//        return boxing;
//    }
//}