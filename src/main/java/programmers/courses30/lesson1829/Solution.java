/*
    https://programmers.co.kr/learn/courses/30/lesson/1829
    [프로그래머스][2017 카카오코드 예선] 카카오프렌즈 컬러링북
 */
package programmers.courses30.lesson1829;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private final static int NUMBER_OF_AREA = 0;
    private final static int MAX_SIZE_OF_ONE_AREA = 1;
    private static int size = 0;
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++){
                if (picture[x][y] > 0 && visited[x][y] != true){
                    size = 1;
                    bfs(picture, visited, x, y, m, n);
                    answer[NUMBER_OF_AREA]++;
                    if(answer[MAX_SIZE_OF_ONE_AREA] < size){
                        answer[MAX_SIZE_OF_ONE_AREA] = size;
                    }
                }
            }
        }
        return answer;
    }

    private void bfs(int[][] picture, boolean[][] visited, int x, int y, int m, int n){
        Queue<Point> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.offer(new Point(x, y));

        while (!queue.isEmpty()){
            Point point = queue.poll();
            for (Direction direction : Direction.values()){
                int newX = point.x + direction.x;
                int newY = point.y + direction.y;
                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                    if (!visited[newX][newY]) {
                        if (picture[point.x][point.y] == picture[newX][newY]) {
                            queue.offer(new Point(newX, newY));
                            visited[newX][newY] = true;
                            size++;
                        }
                    }
                }
            }
        }

    }
}
class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
enum Direction {
    DOWN(0,-1),
    RIGHT(1, 0),
    UP(0,1),
    LEFT(-1,0);

    int x;
    int y;

    Direction(int x, int y){
        this.x = x;
        this.y = y;
    }
}
