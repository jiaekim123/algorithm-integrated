/*
    https://programmers.co.kr/learn/courses/30/lessons/12906
    [프로그래머스][연습문제] 같은 숫자는 싫어
 */
package programmers.courses30.lesson12906;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int beforeNum = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (beforeNum != arr[i]) list.add(arr[i]);
            beforeNum = arr[i];
        }
        return listToArr(list);
    }
    private int[] listToArr(List<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}