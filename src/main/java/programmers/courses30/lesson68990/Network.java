package programmers.courses30.lesson68990;

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

public class Network {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } }));
	}
}
