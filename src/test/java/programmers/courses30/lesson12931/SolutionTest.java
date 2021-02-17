package programmers.courses30.lesson12931;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(6, new Solution().solution(123));
        assertEquals(24, new Solution().solution(987));
    }
}