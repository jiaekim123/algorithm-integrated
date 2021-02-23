package programmers.courses30.lesson12926;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("BC", new Solution().solution("AB", 1));
        assertEquals("a", new Solution().solution("z", 1));
        assertEquals("e F d", new Solution().solution("a B z", 4));
    }
}