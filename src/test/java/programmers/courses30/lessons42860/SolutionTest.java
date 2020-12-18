package programmers.courses30.lessons42860;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(56, new Solution().solution("JEROEN"));
        assertEquals(23, new Solution().solution("JAN"));
    }
}