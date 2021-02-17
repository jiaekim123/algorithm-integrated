package programmers.courses30.lesson12905;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(9, new Solution().solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));
        assertEquals(4, new Solution().solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}}));
        assertEquals(4, new Solution().solution(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}}));
        assertEquals(1, new Solution().solution(new int[][]{{0, 1}, {1, 1}}));
        assertEquals(4, new Solution().solution(new int[][]{{1, 1}, {1, 1}}));
        assertEquals(16, new Solution().solution(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
    }
}