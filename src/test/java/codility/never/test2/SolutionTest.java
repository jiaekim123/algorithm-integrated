package codility.never.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(new int[]{1, 4, 1}, new int[]{1, 5, 1}));
        assertEquals(3, new Solution().solution(new int[]{4, 4, 2, 4}, new int[]{5, 5, 2, 5}));
        assertEquals(2, new Solution().solution(new int[]{2, 3, 4, 2}, new int[]{2, 5, 7, 2}));
    }
}