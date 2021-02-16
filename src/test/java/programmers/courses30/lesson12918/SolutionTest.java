package programmers.courses30.lesson12918;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertFalse(new Solution().solution("a234"));
        assertTrue(new Solution().solution("1234"));
    }
}