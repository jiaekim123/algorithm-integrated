package programmers.courses30.lesson12937;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("Odd", new Solution().solution(3));
        assertEquals("Even", new Solution().solution(4));
    }
}