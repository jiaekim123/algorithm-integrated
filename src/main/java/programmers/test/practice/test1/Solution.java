package programmers.test.practice.test1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final int X = 0;
    private final int Y = 1;

    public int[] solution(int[][] v) {
        int[] answer = {};
        // 1. map으로 x, y 좌표를 모두 저장한다. (mapX mapY)
        // key: x, value: count
        // count가 홀수인 애들을 뽑아내서 answer로 반환한다.
        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();
        for (int[] positions : v) {
            mapX.put(positions[X], mapX.getOrDefault(positions[X], 0) + 1);
            mapX.put(positions[Y], mapX.getOrDefault(positions[Y], 0) + 1);
        }
        

        return answer;
    }
}