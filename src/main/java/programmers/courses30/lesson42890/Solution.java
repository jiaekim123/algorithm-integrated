/*
    https://programmers.co.kr/learn/courses/30/lessons/42890
    [프로그래머스][2019 KAKAO BLIND RECRUITMENT] 후보키
 */
package programmers.courses30.lesson42890;

import java.util.*;

class Solution {
    private final int RELATION_STRING_LENGTH = 8;
    List<boolean[]> results = new ArrayList<>();
    ;

    public int solution(String[][] relation) {
        final int columnLength = relation[0].length;
        boolean[] visited = new boolean[columnLength];

        dfs(relation, visited, columnLength, 0);

        return results.size();
    }

    private void dfs(String[][] relation, boolean[] visited, int columnLength, int k) {
        if (columnLength == k) {
            if (!isDuplicate(relation, visited, columnLength) && isOnlyOne(visited)) {
                results.add(Arrays.copyOf(visited, columnLength));
            }
            return;
        }
        visited[k] = false;
        dfs(relation, visited, columnLength, k + 1);

        visited[k] = true;
        dfs(relation, visited, columnLength, k + 1);
    }

    private boolean isOnlyOne(boolean[] visited) {
        if (results.size() == 0) return true;
        boolean answer = true;
        for (int j = 0; j < results.size(); j++) {
            boolean[] compare = new boolean[visited.length];
            for (int i = 0; i < visited.length; i++) {
                compare[i] = results.get(j)[i] && visited[i];
            }
            if (Arrays.equals(compare, visited) || Arrays.equals(compare, results.get(j))) {
                results.set(j, compare);
                answer = false;
                break;
            }
        }
        return answer;
    }

    private boolean isDuplicate(String[][] relations, boolean[] attributes, int columnLength) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < relations.length; i++) {
            StringBuilder sb = new StringBuilder(RELATION_STRING_LENGTH * columnLength);
            for (int j = 0; j < relations[i].length; j++) {
                if (attributes[j]) {
                    sb.append(relations[i][j]);
                }
            }
            if (sb.length() != 0) set.add(sb.toString());
        }
        return relations.length == set.size() ? false : true;
    }

}