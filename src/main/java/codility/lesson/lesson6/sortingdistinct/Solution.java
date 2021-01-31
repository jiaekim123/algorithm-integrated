/*
    https://app.codility.com/programmers/lessons/6-sorting/distinct/
    [Codility][Lesson6] Sorting Distinct
 */
package codility.lesson.lesson6.sortingdistinct;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }
        return set.size();
    }
}
