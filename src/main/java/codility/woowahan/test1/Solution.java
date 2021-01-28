package codility.woowahan.test1;

import java.util.Arrays;

class Solution {
    public String solution(int U, int L, int[] C) {
        String answer = "IMPOSSIBLE";
        int[][] arr = new int[C.length][2];
        // O(N)
        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                if (U > 0 && L > 0) {
                    // If U and L are greater than 0, fill in arr
                    U--;
                    arr[i][0] = 1;
                    L--;
                    arr[i][1] = 1;
                } else {
                    // If U and L are not greater than 0, IMPOSSIBLE is returned.
                    return answer;
                }
            } else if (C[i] == 1) {
                if (U > 0) {
                    U--;
                    arr[i][0] = 1;
                } else if (L > 0) {
                    L--;
                    arr[i][1] = 1;
                } else {
                    // If U or L is not greater than 0, IMPOSSIBLE is returned.
                    return answer;
                }
            }
            // If both U and L are 0, all arrays are created, arr is converted to String and returned.
            if (U == 0 && L == 0) return makeAnswer(arr);
        }
        return answer;
    }
    private String makeAnswer(int[][] arr){
        // O(N)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<arr.length;i++){
            sb.append(arr[i][0]);
        }
        sb.append(",");
        for (int i = 0; i<arr.length;i++){
            sb.append(arr[i][1]);
        }
        return sb.toString();
    }
}