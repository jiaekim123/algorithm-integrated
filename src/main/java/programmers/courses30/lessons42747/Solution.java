/*
    https://programmers.co.kr/learn/courses/30/lessons/42747
    [프로그래머스][정렬] H-Index (level 2)
 */
package programmers.courses30.lessons42747;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int citation : citations){
            queue.offer(citation);
        }

        while(!queue.isEmpty()){
            if (answer < queue.peek()) {
                queue.poll();
                answer++;
            } else { // answer(논문수)가 인용된 횟수와 같거나 커지는 때
                return answer;
            }
        }
        return answer;
    }
}