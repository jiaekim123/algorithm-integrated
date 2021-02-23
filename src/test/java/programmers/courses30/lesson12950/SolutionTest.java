package programmers.courses30.lesson12950;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[][]{{4, 6}, {7, 9}}, new Solution().solution(new int[][]{{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}}));
        assertArrayEquals(new int[][]{{4}, {6}}, new Solution().solution(new int[][]{{1}, {2}}, new int[][] {{3}, {4}}));
    }
}