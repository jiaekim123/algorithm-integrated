/*
    https://programmers.co.kr/learn/courses/30/lessons/12945
    [프로그래머스][연습문제] 피보나치의 수
 */
package programmers.courses30.lesson12945;

class Solution {
    public int solution(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            nums[i] = (nums[i - 2] + nums[i - 1]) % 1234567;
        }
        return nums[n];
    }
}