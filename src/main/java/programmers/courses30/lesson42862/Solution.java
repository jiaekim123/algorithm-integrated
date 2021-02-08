/*
    https://programmers.co.kr/learn/courses/30/lessons/42862
    [프로그래머스][탐욕법] 체육복
 */
package programmers.courses30.lesson42862;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        Arrays.fill(students, 1); // 체육복이 하나 있는 상태로 초기화

        // 체육복이 있는 친구와 없는 친구 초기화
        Arrays.stream(reserve).forEach(num -> students[num -1] += 1);
        Arrays.stream(lost).forEach(num -> students[num -1] -= 1);

        // 체육복 있는 친구의 나누미 활동
        for (int i = 0; i < n; i++) {
            if (students[i] > 0) {
                continue;
            }
            if (i > 0 && students[i - 1] > 1) {
                students[i - 1] -= 1;
                students[i] += 1;
            }
            if (i < n - 1 && students[i + 1] > 1) {
                students[i + 1] -= 1;
                students[i] += 1;
            }
        }

        return (int) Arrays.stream(students).filter(i -> i > 0).count();
    }
}