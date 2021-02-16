/*
    https://programmers.co.kr/learn/courses/30/lessons/12910
    [프로그래머스][연습문제] 나누어 떨어지는 숫자 배열
 */
package programmers.courses30.lesson12910;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : arr) {
            if (num % divisor == 0) queue.offer(num);
        }
        return getAnswer(queue);
    }

    private int[] getAnswer(Queue<Integer> queue) {
        if (queue.isEmpty()) return new int[]{-1};
        int[] answer = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            answer[i++] = queue.poll();
        }
        return answer;
    }
    // Stream으로 더 간단하게 쓸 수 있을까? -> 코드는 간결하지만 성능적으로 약 20배정도 차이남. (0.49ms -> 10ms)
//    public int[] solution(int[] arr, int divisor) {
//        int[] answer =  Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();
//        return answer.length == 0 ? new int[] {-1} : answer;
//    }


}