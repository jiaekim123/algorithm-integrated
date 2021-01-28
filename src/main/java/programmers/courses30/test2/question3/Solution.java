package programmers.courses30.test2.question3;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(int n, int[][] quests) {
        int[] answer = new int[n];
        // 먼저 완료해야 하는 퀘스트 순으로 정렬
        Queue<Quest> queue = new PriorityQueue<>();
        for (int[] quest : quests) {
            queue.offer(new Quest(quest[0], quest[1]));
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            // 조건이 있을 경우 조건에 해당하는 pre값을 먼저 answer에 넣는다.
            while (queue.peek().num >= i && !isInAnswer(queue.peek().pre, answer)) {
                answer[count] = queue.poll().pre;
                count++;
            }
            // 조건이 있는 퀘스트의 가장 작은 값보다 현재 값이 작으면 그냥 answer에 추가
            if (!isInAnswer(i, answer)) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }

    private boolean isInAnswer(int num, int[] answer) {
        for (int n : answer) {
            if (n == num) return true;
        }
        return false;
    }
}

class Quest implements Comparable<Quest> {
    int pre;
    int num;

    public Quest(int pre, int num) {
        this.pre = pre;
        this.num = num;
    }

    @Override
    public int compareTo(Quest quest) {
        return quest.num != this.num ? this.num - quest.num : this.pre - quest.pre;
    }
}