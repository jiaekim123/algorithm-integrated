/*
    https://programmers.co.kr/learn/courses/30/lessons/68644
    [프로그래머스][월간코드챌린지] 두 개 뽑아서 더하기
 */
package programmers.courses30.lesson68644;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> nums = new HashSet<>();
        final int length = numbers.length;
        boolean[] visited = new boolean[length];

        dfs(numbers, visited, 0, 0, length, nums);

        return getAnswer(nums);
    }

    private int[] getAnswer(Set<Integer> nums) {
        int[] answer = new int[nums.size()];
        // 오름차순 정렬
        Iterator<Integer> it = nums.iterator();
        int i = 0;
        while (it.hasNext()) {
            answer[i] = it.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }

    // n개 중 2개 선택해서 Set에 추가하기
    private void dfs(int[] numbers, boolean[] visited, int k, int n, int length, Set<Integer> nums) {
        if (k == length) {
            if (n == 2) nums.add(getAddNum(numbers, visited));
            return;
        }
        visited[k] = false;
        dfs(numbers, visited, k + 1, n, length, nums);
        visited[k] = true;
        dfs(numbers, visited, k + 1, n + 1, length, nums);
    }

    // visited가 true인 것을 골라서 더하기
    private int getAddNum(int[] numbers, boolean[] visited) {
        int num = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) num += numbers[i];
        }
        return num;
    }
}