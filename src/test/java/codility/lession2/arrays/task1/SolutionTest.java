package codility.lession2.arrays.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {9,7,6,3,8}, new Solution().solution(new int[] {3, 8, 9, 7, 6}, 3));
    }
}