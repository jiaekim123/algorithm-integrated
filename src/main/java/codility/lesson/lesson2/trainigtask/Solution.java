package codility.lesson.lesson2.trainigtask;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<A.length; i++){
            if (map.get(A[i])==null){
                map.put(A[i], 1);
            } else {
                map.replace(A[i], map.get(A[i]) + 1);
            }
        }

        for (Integer num : map.keySet()){
            if (map.get(num) % 2 != 0) return num;
        }

        return answer;
    }
}