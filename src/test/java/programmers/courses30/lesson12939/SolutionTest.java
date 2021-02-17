package programmers.courses30.lesson12939;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("1 4", new Solution().solution("1 2 3 4"));
        assertEquals("-4 -1", new Solution().solution("-1 -2 -3 -4"));
        assertEquals("-1 -1", new Solution().solution("-1 -1"));
    }
}