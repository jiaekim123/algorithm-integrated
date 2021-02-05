package programmers.courses30.lesson68644;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7}, new Solution().solution(new int[]{2, 1, 3, 4, 1}));
        assertArrayEquals(new int[]{2, 5, 7, 9, 12}, new Solution().solution(new int[]{5, 0, 2, 7}));
    }
}