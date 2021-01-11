package codility.lesson.lesson4.maxcounters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, new Solution().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
    }
}