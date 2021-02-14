package programmers.courses30.lesson12901;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("TUE", new Solution().solution(5, 24));
        assertEquals("WED", new Solution().solution(1, 20));
        assertEquals("MON", new Solution().solution(2, 29));
        assertEquals("TUE", new Solution().solution(12, 20));
    }
}