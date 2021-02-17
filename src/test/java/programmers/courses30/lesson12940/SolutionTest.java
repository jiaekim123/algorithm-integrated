package programmers.courses30.lesson12940;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {3, 12}, new Solution().solution(3, 12));
        assertArrayEquals(new int[] {1, 10}, new Solution().solution(2, 5));
        assertArrayEquals(new int[] {2, 30}, new Solution().solution(10, 6));
        assertArrayEquals(new int[] {2, 24}, new Solution().solution(8, 6));
    }
}