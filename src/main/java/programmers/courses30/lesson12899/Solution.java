/*
    https://programmers.co.kr/learn/courses/30/lessons/12899
    [코딩테스트연습][연습문제] 124나라의 숫자
 */
package programmers.courses30.lesson12899;

class Solution {
    public String solution(int n) {
        int[] nums = { 4, 1, 2 };
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int remain = n % 3;
            n /= 3;
            if (remain == 0) {
                n--;
            }
            sb.insert(0, nums[remain]);
        }
        return sb.toString();
    }
}