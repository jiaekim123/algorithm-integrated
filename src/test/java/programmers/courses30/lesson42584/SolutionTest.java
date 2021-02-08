package programmers.courses30.lesson42584;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, new Solution().solution(new int[]{1, 2, 3, 2, 3}));
    }
}