package programmers.courses30.lesson43162;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } }));
        assertEquals(1, new Solution().solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } }));
    }
}