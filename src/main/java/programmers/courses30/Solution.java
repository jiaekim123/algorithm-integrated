/*
    https://programmers.co.kr/learn/courses/30/lessons/43163
    [프로그래머스][DFS] 단어변환
 */
package programmers.courses30;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        char[][] wordArr = new char[words.length][words[0].length()];
        boolean[] visited = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            wordArr[i] = words[i].toCharArray();
        }
        PriorityQueue<Integer> answerQueue = new PriorityQueue<Integer>();
        dfs(begin.toCharArray(), target.toCharArray(), visited, wordArr, 0, answerQueue);
        if (answerQueue.isEmpty()) return 0;
        return answerQueue.peek();
    }

    private void dfs(char[] word, char[] target, boolean[] visited, char[][] words, int count, Queue<Integer> answerList) {
        if (!isAllVisited(visited)) {
            if (Arrays.equals(word, target)) {
                answerList.offer(count);
            } else {
                for (int i = 0; i < words.length; i++) {
                    if (!visited[i] && isOneWordDiff(word,words[i])) {
                        visited[i] = true;
                        dfs(words[i], target, visited, words, count + 1, answerList);
                        visited[i] = false;
                    }
                }
            }
        }
    }

    private boolean isAllVisited(boolean[] visited) {
        for (boolean visit : visited) {
            if (!visit) return false;
        }
        return true;
    }

    private boolean isOneWordDiff(char[] word, char[] compWord) {
        int count = 0;
        for (int i = 0; i < word.length && count < 2; i++) {
            if (word[i] != compWord[i]) {
                count++;
            }
        }
        return count == 1;
    }
}