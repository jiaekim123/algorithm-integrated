package programmers.courses30.lessons42842;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{4, 3}, new Solution().solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, new Solution().solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, new Solution().solution(24, 24));
    }
}