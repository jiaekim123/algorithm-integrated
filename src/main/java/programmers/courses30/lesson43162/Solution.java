/*
    https://programmers.co.kr/learn/courses/30/lessons/43162
    [프로그래머스][DFS] 네트워크
 */
package programmers.courses30.lesson43162;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[computers.length];
        // 모든 컴퓨터에 방문
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i])
                answer++;
            dfs(computers, visited, i);
        }

        return answer;
    }

    private void dfs(int[][] computers, boolean[] visited, int num) {
        visited[num] = true;

        // 컴퓨터랑 연결된 모든 컴퓨터에 방문
        for (int i = 0; i < computers.length; i++) {
            if (computers[num][i] == 1 && visited[i] == false) {
                dfs(computers, visited, i);
            }
        }

    }
}