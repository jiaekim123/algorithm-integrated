package codility.lesson.lesson4.maxcounters;

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];

        for (int k : A) {
            if (k == N + 1) {
                int max = Arrays.stream(answer).max().orElse(0);
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = max;
                }
            } else {
                answer[k - 1]++;
            }
        }

        return answer;
    }
}
