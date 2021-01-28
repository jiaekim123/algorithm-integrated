package programmers.courses30.test.level2.question2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Queue<Integer> queueA = new PriorityQueue<>();
        Queue<Integer> queueB = new PriorityQueue<>(Comparator.reverseOrder());

        for (int a : A) queueA.offer(a);
        for (int b : B) queueB.offer(b);

        while (!queueA.isEmpty()) {
            answer += queueA.poll() * queueB.poll();
        }

        return answer;
    }
}