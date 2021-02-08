package programmers.courses30.lesson42583;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(8, new Solution().solution(2, 10, new int[] {7, 4, 5, 6}));
        assertEquals(101, new Solution().solution(100, 100, new int[] {10}));
        assertEquals(110, new Solution().solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}));
    }
}