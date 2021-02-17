/*
    https://programmers.co.kr/learn/courses/30/lessons/12939
    [프로그래머스][연습문제] 최댓값과 최솟값
 */
package programmers.courses30.lesson12939;

class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length; i++){
            min = Math.min(Integer.parseInt(nums[i]), min);
            max = Math.max(Integer.parseInt(nums[i]), max);
        }

        return min + " " + max;
    }
}