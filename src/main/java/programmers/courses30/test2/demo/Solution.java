package programmers.courses30.test2.demo;

import java.util.*;

class Solution {
    public int[] solution(int[][] v) {
        List<Integer> x = new LinkedList<>();
        List<Integer> y = new LinkedList<>();
        for (int [] point : v) {
            if (x.contains(point[0])) x.remove(x.indexOf(point[0]));
            else {
                x.add(point[0]);
            }
            if (y.contains(point[1])) y.remove(y.indexOf(point[1]));
            else {
                y.add(point[1]);
            }
        }

        return new int[] {x.get(0), y.get(0)};
    }
}