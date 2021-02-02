package programmers.courses30.lesson42883;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("94", new Solution().solution("1924", 2));
        assertEquals("3234", new Solution().solution("1231234", 3));
        assertEquals("775841", new Solution().solution("4177252841", 4));
        assertEquals("9", new Solution().solution("999", 2));
        assertEquals("999", new Solution().solution("999991", 3));
        assertEquals("119", new Solution().solution("111119", 3));
    }
}