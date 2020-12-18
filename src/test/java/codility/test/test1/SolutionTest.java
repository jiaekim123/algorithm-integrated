package codility.test.test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(5, new Solution().solution(new int[] {1,3,6,4,1,2}));
        assertEquals(4, new Solution().solution(new int[] {1,2,3}));
        assertEquals(1, new Solution().solution(new int[] {-1,-3}));
    }
}