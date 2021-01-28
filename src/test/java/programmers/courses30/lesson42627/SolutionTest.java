package programmers.courses30.lesson42627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(9, new Solution().solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
}