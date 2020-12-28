package codility.test.test1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // 중복 제거, 정렬
        Set<Integer> values = new HashSet<>();
        for (int num : A){
            values.add(num);
        }
        Integer[] sortedArr = values.toArray(new Integer[values.size()]);
        Arrays.sort(sortedArr);

        int lastNum = 1;
        for (int i = 0; i < sortedArr.length; i++) {
            if (lastNum == sortedArr[i]){
                lastNum++;
            }
        }
        return lastNum;
    }
}