package codility.lesson3.permmissingelem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(4, new Solution().solution(new int[] {2, 3, 1, 5}));
        assertEquals(1, new Solution().solution(new int[] {}));
        assertEquals(2, new Solution().solution(new int[] {1}));
        assertEquals(3, new Solution().solution(new int[] {2, 1}));
    }
}