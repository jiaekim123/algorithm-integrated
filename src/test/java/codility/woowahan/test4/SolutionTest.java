package codility.woowahan.test4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(new int[]{1, 3, 2, 1}, new int[]{4, 2, 5, 3, 2}));
        assertEquals(2, new Solution().solution(new int[]{4, 2, 5, 3, 2}, new int[]{1, 3, 2, 1}));
        assertEquals(-1, new Solution().solution(new int[]{2, 1}, new int[]{3, 3}));
        assertEquals(111, new Solution().solution(new int[]{111,111,222,111,444,100,50}, new int[]{1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,60,670,30,111}));
    }
}