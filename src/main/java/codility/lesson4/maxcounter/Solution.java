/*
    https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
    [Codility][Lesson4] Counting Elements - Max Counters
 */
package codility.lesson4.maxcounter;

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        for (int num : A) {
            if (num == N + 1){
                int max = Arrays.stream(answer).max().orElse(0);
                for (int i = 0; i <N; i++){
                    answer[i] = max;
                }
            } else {
                answer[num-1]++;
            }
        }
        return answer;
    }
}
