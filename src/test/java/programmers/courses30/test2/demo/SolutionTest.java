package programmers.courses30.test2.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {1, 10}, new Solution().solution(new int[][] {{1, 4}, {3, 4}, {3, 10}}));
        assertArrayEquals(new int[] {2, 1}, new Solution().solution(new int[][] {{1, 1}, {2, 2}, {1, 2}}));
    }
}