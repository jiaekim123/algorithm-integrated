package programmers.courses30.lesson12916;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertTrue(new Solution().solution("pPoooyY"));
        assertFalse(new Solution().solution("Pyy"));
    }
}