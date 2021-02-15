/*
    https://programmers.co.kr/learn/courses/30/lessons/12912
    [프로그래머스][연습문제] 두 정수 사이의 합
 */
package programmers.courses30.lesson12912;

class Solution {
    public long solution(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
//        // 이거 등차수열 식으로 푸는게 빠르겠는데
//        for (int i = a; i <= b; i++) {
//            answer += i;
//        }
        return (long)(b - a + 1) * (long)(a + b) / 2;
    }
}