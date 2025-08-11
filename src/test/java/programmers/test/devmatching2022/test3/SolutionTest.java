package programmers.test.devmatching2022.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {4, 0}, {5, 1}, {6, 1}, {7, 2}, {7, 3}, {4, 5}, {5, 6}, {6, 7}};
        Assertions.assertEquals(7,
                new Solution().solution(8, edges, 4, 0, 3));
    }
}