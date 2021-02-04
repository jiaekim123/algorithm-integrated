/*
    https://programmers.co.kr/learn/courses/30/lessons/42861
    [프로그래머스][탐욕법(Greedy)] 섬 연결하기 - 크루스칼 알고리즘
    참고 사이트: https://blog.naver.com/ssarang8649/221038259400
 */
package programmers.courses30.lesson42861;

import java.util.*;

class Solution {
    private static int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Queue<Edge> edges = new PriorityQueue<>();
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i<costs.length; i++){
            edges.add(new Edge(costs[i][0], costs[i][1], costs[i][2]));
        }

        while (!edges.isEmpty()) {
            Edge edge = edges.poll();

            if (find(edge.start) == find(edge.end)) continue; // 사이클을 이루는 경우
            else { // 사이클이 없으면 answer 값을 올리고 union으로 parent값 설정
                union(edge.start, edge.end);
                answer += edge.cost;
            }
        }

        return answer;
    }
    private int find(int n){
        if (parent[n] == n) return n;
        else return parent[n] = find(parent[n]);
    }

    public void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(rootA != rootB) parent[rootA] = rootB;
    }
    private static class Edge implements Comparable<Edge>{
        int start;
        int end;
        int cost;
        Edge (int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}