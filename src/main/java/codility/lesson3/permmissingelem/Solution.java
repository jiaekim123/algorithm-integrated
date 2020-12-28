/*
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    [Codility][TimeComplexity] PermMissingElem
 */
package codility.lesson3.permmissingelem;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int i = 1;
        for (int num : A) {
            if (num != i) return i;
            i++;
        }
        return i;
    }
}
