package codility.woowahan.test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertEquals("11001,10100", new Solution().solution(3, 2, new int[]{2, 1, 1, 0, 1}));
        assertEquals("IMPOSSIBLE", new Solution().solution(0, 0, new int[]{2, 1, 1, 0, 1}));
//        assertEquals("IMPOSSIBLE", new Solution().solution(2, 3, new int[]{0, 0, 1, 1, 2}));
//        assertEquals("1010,1010", new Solution().solution(2, 2, new int[]{2, 0, 2, 0}));
    }
}