package programmers.courses30.lesson12941;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(29, new Solution().solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
        assertEquals(10, new Solution().solution(new int[] {1, 2}, new int[] {3, 4}));
    }
}