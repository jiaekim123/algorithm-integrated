/*
    https://programmers.co.kr/learn/courses/30/lessons/68644
    [프로그래머스][월간코드챌린지] 두 개 뽑아서 더하기
 */
package programmers.courses30.lesson68644;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> nums = selectTwoNum(numbers);
        // nums.stream().mapToInt(Integer::intValue).toArray(); // 성능이 좋지 않음.
        return getAnswer(nums);
    }

    // n개 중 2개 선택해서 Set에 추가하기
    private Set<Integer> selectTwoNum(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (i != j) set.add(numbers[i] + numbers[j]);
            }
        }
        return set;
    }

    private int[] getAnswer(Set<Integer> nums) {
        int[] answer = new int[nums.size()];
        Iterator<Integer> it = nums.iterator();
        int i = 0;
        while (it.hasNext()) {
            answer[i] = it.next();
            i++;
        }
        return answer;
    }
}