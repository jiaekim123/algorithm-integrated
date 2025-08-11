package programmers.courses30.lesson77485;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        int[][] map = initMap(rows, columns);
        
        return answer;
    }

    private int[][] initMap(int rows, int columns) {
        int[][] map = new int[rows][columns];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                map[i - 1][j - 1] = (j - 1) * columns + i;
            }
        }
        return map;
    }
}