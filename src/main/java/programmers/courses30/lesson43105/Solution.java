package programmers.courses30.lesson43105;

import java.util.Queue;

class Solution {
    public int solution(int[][] triangle) {
        return reverseDP(triangle);
    }

    public void dfs(int[][] triangle, int num, int row, int col, int depth, Queue<Integer> answers) {
        num += triangle[row][col];
        if (depth == triangle.length - 1) {
            answers.add(num);
        } else {
            dfs(triangle, num, row + 1, col, depth + 1, answers);
            dfs(triangle, num, row + 1, col + 1, depth + 1, answers);
        }
    }

    public int dp(int[][] triangle) {
        int row = triangle.length;
        int col = triangle[triangle.length - 1].length;
        int[][] max = new int[row][col];
        int answer = 0;
        max[0][0] = triangle[0][0];
        for (int i = 1; i < row; i++) {
            max[i][0] = max[i - 1][0] + triangle[i][0];
            for (int j = 1; j <= i; j++) {
                if (max[i - 1][j] >= max[i - 1][j - 1]) {
                    max[i][j] = max[i - 1][j] + triangle[i][j];
                } else {
                    max[i][j] = max[i - 1][j - 1] + triangle[i][j];
                }
            }
        }
        for (int j = 0; j < col; j++) {
            if (answer < max[row - 1][j])
                answer = max[row - 1][j];
        }
        return answer;
    }

    public int reverseDP(int[][] triangle) {
        int row = triangle.length;
        int col = triangle[triangle.length - 1].length;
        int[][] max = new int[row][col];

        // 맨 밑행 초기화
        for (int j = 0; j < col; j++) {
            max[row-1][j] = triangle[row-1][j];
        }

        // 밑행부터 올라가면서 최대값 구하기
        for (int i = row-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                max[i][j] = Math.max(max[i+1][j], max[i+1][j+1]) + triangle[i][j];
            }
        }

        return max[0][0];
    }
}