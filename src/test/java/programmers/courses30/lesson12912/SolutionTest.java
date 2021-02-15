package programmers.courses30.lesson12912;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(12, new Solution().solution(3, 5));
        assertEquals(3, new Solution().solution(3, 3));
        assertEquals(12, new Solution().solution(5, 3));
    }
}