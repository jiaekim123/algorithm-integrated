package programmers.courses30.lesson12914;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(5, new Solution().solution(4));
        assertEquals(3, new Solution().solution(3));
        assertEquals(1, new Solution().solution(1));
    }
}