/*
  https://programmers.co.kr/learn/courses/30/lessons/68936
  [프로그래머스][월간 코드 챌린지 시즌1] 쿼드압축 후 개수 세기 (level 2)
 */
package programmers.courses30.lesson68936;

import java.util.*;

class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = {};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 0);
        recursion(arr, map);
        return new int[] {map.get(0), map.get(1)};
    }
    private boolean checkSquareSame(int[][] arrays){
        int mark = arrays[0][0];
        for (int[] arr : arrays){
            for (int num : arr){
                if (num != mark) return false;
            }
        }
        return true;
    }
    private void recursion(int[][] arrays, Map<Integer, Integer> map){
        if (checkSquareSame(arrays)){
            map.replace(arrays[0][0], map.get(arrays[0][0]) + 1);
            return;
        }
        if (arrays.length==2){
            for (int[] array : arrays){
                for (int num : array){
                    map.replace(num, map.get(num) + 1);
                }
            }
            return;
        }
        recursion(getNewArray(arrays, 0, arrays.length/2, 0, arrays.length/2), map);
        recursion(getNewArray(arrays, 0 , arrays.length/2, arrays.length/2, arrays.length), map);
        recursion(getNewArray(arrays, arrays.length/2, arrays.length, 0, arrays.length/2), map);
        recursion(getNewArray(arrays, arrays.length/2, arrays.length, arrays.length/2, arrays.length), map);
    }
    private int[][] getNewArray(int[][] arrays, int x_start, int x_end, int y_start, int y_end){
        int[][] newArrays = new int[y_end - y_start][x_end - x_start];
        for (int i = y_start; i < y_end; i++){
            newArrays[i-y_start] = Arrays.copyOfRange(arrays[i], x_start, x_end);
        }
        return newArrays;
    }
}