package codility.lession1.literations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(9));
        assertEquals(4, new Solution().solution(529));
        assertEquals(1, new Solution().solution(20));
        assertEquals(0, new Solution().solution(15));
        assertEquals(5, new Solution().solution(1041));
    }
}