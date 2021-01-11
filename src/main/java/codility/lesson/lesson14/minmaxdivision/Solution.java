package codility.lesson.lesson14.minmaxdivision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int K, int M, int[] A) {
        int answer = 0;
        Integer[] nums = new Integer[A.length];
        for (int i = 0; i<A.length; i++){
            nums[i] = A[i];
        }

        Arrays.sort(nums, Collections.reverseOrder());

        NumSet[] numSets = new NumSet[K];

        int i = 0;
        while (i < K && i<A.length){
            numSets[i] = new NumSet();
            numSets[i].addNum(nums[i]);
            i++;
        }

        while (i < A.length) {
            Arrays.sort(numSets);
            numSets[0].addNum(nums[i]);
            i++;
        }

        int j = 0;

        while (j < K && j <A.length){
            answer = Math.max(answer, numSets[j].sum);
            j++;
        }
        return answer;
    }
}

class NumSet implements Comparable<NumSet> {
    List<Integer> list;
    int sum;

    NumSet (){
        list = new ArrayList<>();
        sum = 0;
    }

    public void addNum(int num){
        list.add(num);
        sum += num;
    }

    @Override
    public int compareTo(NumSet o) {
        return this.sum - o.sum;
    }
}