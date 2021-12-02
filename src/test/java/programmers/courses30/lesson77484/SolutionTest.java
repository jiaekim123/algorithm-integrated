package programmers.courses30.lesson77484;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void solution() {
        assertArrayEquals(new int[]{3, 5}, new Solution().solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
        assertArrayEquals(new int[]{1, 6}, new Solution().solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}));
        assertArrayEquals(new int[]{1, 1}, new Solution().solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }
}