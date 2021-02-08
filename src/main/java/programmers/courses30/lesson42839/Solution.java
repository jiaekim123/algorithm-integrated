/*
    https://programmers.co.kr/learn/courses/30/lessons/42839
    [프로그래머스][완전탐색] 소수 찾기
 */
package programmers.courses30.lesson42839;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        // 1. 받은 String 값으로 숫자를 만들어서 int[]에 넣는다.
        List<Integer> numList = getNumList(numbers);

        // 2. 만든 int[]의 n보다 작은 숫자로 나누어 떨어지는지 확인한다. (0,1 제외)
        for (Integer num : numList) {
            // 3. 나누어 떨어지지 않는 경우 answer값을 하나 늘린다.
            if (isPrimeNum(num)) {
                answer++;
            }
        }

        return answer;
    }

    private List<Integer> getNumList(String numbers) {
        List<Integer> numList = new ArrayList<Integer>();
        int[] nums = new int[numbers.length()];
        // String을 int[]로 바꾼다.
        for (int i=0; i<numbers.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        //실제로 값이 0인지 null인지 구분
        int[] output = new int[numbers.length()];
        for(int i=0; i<output.length; i++) {
            output[i] = -1;
        }
        boolean[] visited = new boolean[numbers.length()];
        permutation(nums, output, numList, visited, 0);

//    	System.out.println(numList);
        return numList;
    }

    // 순열로 값을 넣어주자
    private void permutation(int[] arr, int[] out, List<Integer> numList, boolean[] visited, int depth) {
        if (depth != 0) {
            StringBuilder strNum = new StringBuilder();
            for (int i = 0; i<out.length; i++) {
                if (i == 0) {
                    strNum = strNum.append(out[i]);
                } else {
                    if (out[i] != -1)
                        strNum.append(out[i]);
                }
            }
            if(!numList.contains(Integer.parseInt(strNum.toString()))){
                numList.add(Integer.parseInt(strNum.toString()));
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, numList, visited, depth+1);
                visited[i] = false;
                out[depth] = -1;
            }
        }
    }

    private boolean isPrimeNum(int num) {
        if (num == 0 || num == 1) return false;
        else if (num == 2) return true;

        for (int i=2; i<num; i++) {
            if(num%i==0) return false;
        }

        return true;
    }
}