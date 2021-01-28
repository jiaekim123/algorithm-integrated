package programmers.courses30.lesson68646;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(new int[]{9, -1, -5}));
        assertEquals(6, new Solution().solution(new int[]{-16, 27, 65, -2, 58, -92, -71, -68, -61, -33}));
    }
}