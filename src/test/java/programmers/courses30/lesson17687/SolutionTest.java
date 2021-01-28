package programmers.courses30.lesson17687;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("0111", new Solution().solution(2, 4, 2, 1));
        assertEquals("02468ACE11111111", new Solution().solution(16, 16, 2, 1));
        assertEquals("13579BDF01234567", new Solution().solution(16, 16, 2, 2));
    }
}