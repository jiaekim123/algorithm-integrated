package programmers.test.devmatching2022.test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        int[][] dist1 = new int[][]{{0, 5, 2, 4, 1}, {5, 0, 3, 9, 6}, {2, 3, 0, 6, 3}, {4, 9, 6, 0, 3}, {1, 6, 3, 3, 0}};
        int[][] dist2 = new int[][]{{0, 2, 3, 1}, {2, 0, 1, 1}, {3, 1, 0, 2}, {1, 1, 2, 0}};
        Assertions.assertArrayEquals(
                new int[][]{{1, 2, 0, 4, 3}, {3, 4, 0, 2, 1}},
                new Solution().solution(dist1));

        Assertions.assertArrayEquals(
                new int[][]{{1, 2, 0, 4, 3}, {3, 4, 0, 2, 1}},
                new Solution().solution(dist1));
    }
}