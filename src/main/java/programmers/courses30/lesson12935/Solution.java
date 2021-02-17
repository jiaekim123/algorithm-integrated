/*
    https://programmers.co.kr/learn/courses/30/lessons/12935
    [프로그래머스][연습문제] 제일 작은 수 제거하기
 */
package programmers.courses30.lesson12935;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length; i++){
            if (min > arr[i]){ min = arr[i]; min_index = i; }
            list.add(arr[i]);
        }
        list.remove(min_index);
        return getAnswer(list);
    }
    private int[] getAnswer(List<Integer> list){
        if (list.size() == 0) return new int[] {-1};
        int[] answer = new int[list.size()];
        for (int i = 0; i <list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}