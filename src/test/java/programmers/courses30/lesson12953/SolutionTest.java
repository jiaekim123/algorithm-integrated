package programmers.courses30.lesson12953;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(168, new Solution().solution(new int[] {2, 6, 8, 14}));
        assertEquals(6, new Solution().solution(new int[] {1,2,3}));
    }
}