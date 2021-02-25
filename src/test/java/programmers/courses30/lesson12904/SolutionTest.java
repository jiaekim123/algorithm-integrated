package programmers.courses30.lesson12904;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(7, new Solution().solution("abcdcba"));
        assertEquals(3, new Solution().solution("abacde"));
    }
}