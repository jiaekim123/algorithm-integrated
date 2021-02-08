/*
    https://programmers.co.kr/learn/courses/30/lessons/43165
    [프로그래머스][DFS] 타겟넘버
 */
package programmers.courses30.lesson43165;

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int sum, int depth) {
        if (depth == numbers.length) {
            return (sum == target) ? 1 : 0;
        } else {
            return dfs(numbers, target, sum + numbers[depth], depth + 1)
                    + dfs(numbers, target, sum - numbers[depth], depth + 1);
        }
    }
}