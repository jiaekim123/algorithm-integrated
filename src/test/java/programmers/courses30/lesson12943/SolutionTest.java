package programmers.courses30.lesson12943;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(8, new Solution().solution(6));
        assertEquals(4, new Solution().solution(16));
        assertEquals(-1, new Solution().solution(626331));
    }
}