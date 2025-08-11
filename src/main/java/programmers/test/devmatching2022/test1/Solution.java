package programmers.test.devmatching2022.test1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int[][] dist) {
        List<int[]> answerList = new ArrayList<>();

        // DFS
        int[][] answer = new int[dist.length][answerList.size()];
        return answer;
    }

    private void dfs(int[][] dist, boolean[] visited, int num, List<int[]> answerList) {
        visited[num] = true;

        // 방문한 지점을 +, -로 위치시켜봄
        // 다음 방문하는 노드가 기존에 계산했던 값과 동일한 위치에 있으면 OK
    }
}