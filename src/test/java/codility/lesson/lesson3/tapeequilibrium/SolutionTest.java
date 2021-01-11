package codility.lesson.lesson3.tapeequilibrium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(1, new Solution().solution(new int[]{3, 1, 2, 4, 3}));
        assertEquals(1, new Solution().solution(new int[]{2, 1}));
    }
}