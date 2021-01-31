/*
    https://programmers.co.kr/learn/courses/30/lessons/17681
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 비밀지도 (level 1)
 */
package programmers.courses30.lesson17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] binaryArray1 = new int[n][n];
        int[][] binaryArray2 = new int[n][n];

        for (int i = 0; i < n; i++){
            binaryArray1[i] = decimalToBinary(n, arr1[i]);
            binaryArray2[i] = decimalToBinary(n, arr2[i]);
        }

        return changeBinaryToMap(n, binaryArray1, binaryArray2);
    }

    private int[] decimalToBinary(int n, int decimal){
        int[] binary = new int[n];
        int i = n-1;
        while (i>=0){
            binary[i] = decimal % 2;
            decimal = decimal / 2;
            i--;
        }
        return binary;
    }

    private String[] changeBinaryToMap(int n, int[][] bArr1, int[][] bArr2){
        String[] map = new String[n];
        for (int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j<n; j++){
                if (bArr1[i][j]==0 && bArr2[i][j]==0){
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            map[i] = sb.toString();
        }


        return map;
    }
}