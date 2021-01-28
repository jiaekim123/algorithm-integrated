package codility.woowahan.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(new int[]{3, 2, -2, 5, -3}));
        assertEquals(1, new Solution().solution(new int[]{1, 1, 2, -1, 2, -1}));
        assertEquals(0, new Solution().solution(new int[]{1, 2, 3, -4}));
    }
}