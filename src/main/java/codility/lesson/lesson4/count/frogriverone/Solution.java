package codility.lesson.lesson4.count.frogriverone;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int X, int[] A) {
        int answer = -1;
        Set<Integer> leaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            leaves.add(A[i]);
            if (leaves.size() == X) return i;
        }
        return answer;
    }
}
