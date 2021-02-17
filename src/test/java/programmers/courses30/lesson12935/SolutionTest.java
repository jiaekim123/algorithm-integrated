package programmers.courses30.lesson12935;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{4, 3, 2}, new Solution().solution(new int[] {4, 3, 2, 1}));
        assertArrayEquals(new int[]{-1}, new Solution().solution(new int[] {10}));
    }
}