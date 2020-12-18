/*
  https://programmers.co.kr/learn/courses/30/lessons/68645
  [프로그래머스][월간 코드 챌린지 시즌1] 삼각 달팽이 (level 2)
 */
package programmers.courses30.lessons68645;

class Solution {
    public int[] solution(int n) {
        int[][] matrix = fillMatrix(n);
        int[] answer = matrixToArray(matrix, n);
        return answer;
    }

    private int[][] fillMatrix(int n){
        int[][] matrix = new int[n][n];
        int y = -1, x = 0;
        int num = 1;

        for (int i = 0; i < n; i++) { // 직선의 수 (n개의 직선이 그려짐)
            for (int j = i; j < n; j++) { // 아래 - 밑변 - 대각선을 돌때마다 돌 수 있는 칸이 하나씩 줄어들음.
                if (i % 3 == 0) { // 왼쪽 대각선 (아래)
                    y++;
                } else if (i % 3 == 1) { // 밑변
                    x++;
                } else if (i % 3 == 2) { // 오른쪽 대각선
                    y--;
                    x--;
                }
                matrix[y][x] = num++;
            }
        }
        return matrix;
    }

    private int[] matrixToArray(int[][] matrix, int n){
        int[] array = new int[(n * (n + 1)) / 2];
        int num = 0;

        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                if(matrix[y][x] == 0)
                    break;
                array[num++] = matrix[y][x];
            }
        }
        return array;
    }
}