package programmers.courses30.lesson42839;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution("17"));
        assertEquals(2, new Solution().solution("011"));
    }
}