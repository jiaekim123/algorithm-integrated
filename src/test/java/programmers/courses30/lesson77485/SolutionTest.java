package programmers.courses30.lesson77485;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solution() {
        Assertions.assertArrayEquals(new int[]{8, 10, 25}, new Solution().solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}));
        Assertions.assertArrayEquals(new int[]{1, 1, 5, 3}, new Solution().solution(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}}));
        Assertions.assertArrayEquals(new int[]{1}, new Solution().solution(100, 97, new int[][]{{1, 1, 100, 97}}));
    }
}