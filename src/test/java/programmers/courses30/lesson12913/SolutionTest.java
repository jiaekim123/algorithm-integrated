package programmers.courses30.lesson12913;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(16, new Solution().solution(new int[][] {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}