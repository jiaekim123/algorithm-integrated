package programmers.courses30.lesson42747;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(new int[]{3, 0, 6, 1, 5}));
        assertEquals(4, new Solution().solution(new int[]{10, 8, 5, 4, 3})); // wiki
        assertEquals(3, new Solution().solution(new int[]{25, 8, 5, 3, 3})); // wiki
        assertEquals(3, new Solution().solution(new int[]{10, 9, 4, 1, 1}));
        assertEquals(2, new Solution().solution(new int[]{31, 66}));
        assertEquals(2, new Solution().solution(new int[]{2, 2}));
    }
}