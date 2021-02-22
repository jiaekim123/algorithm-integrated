package programmers.courses30.lesson12954;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new long[] {2, 4, 6, 8, 10}, new Solution().solution(2, 5));
        assertArrayEquals(new long[] {4, 8, 12}, new Solution().solution(4, 3));
        assertArrayEquals(new long[] {-4, -8}, new Solution().solution(-4, 2));
    }
}