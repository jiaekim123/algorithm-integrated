/*
    https://programmers.co.kr/learn/courses/30/lessons/42897
    [프로그래머스][동적계획법] 도둑질
 */
package programmers.courses30.lesson42897;

class Solution {
    public int solution(int[] money) {
        return Math.max(dp(money, money[0], money[0], money.length - 1), dp(money, 0, money[1], money.length));
    }

    public int dp(int[] money, int first, int second, int last) {
        int max[] = new int[money.length];
        max[0] = first;
        max[1] = second;
        for (int i = 2; i < last; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + money[i]);
        }
        return max[last-1];
    }
    public int includeFirstor(int[] money) {
        int max[] = new int[money.length];
        max[0] = money[0];
        max[1] = money[0];
        for (int i = 2; i < money.length-1; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + money[i]);
        }
        return max[money.length-2];
    }

    public int excludeFirst(int[] money) {
        int max[] = new int[money.length];
        max[0] = 0;
        max[1] = money[1];
        for (int i = 2; i < money.length; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + money[i]);
        }
        return max[money.length-1];
    }
}