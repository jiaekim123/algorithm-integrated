package codility.lesson.lesson14.minmaxdivision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertEquals(6, new Solution().solution(3, 5, new int[]{2, 1, 5, 1, 2, 2, 2}));
        assertEquals(2, new Solution().solution(3, 5, new int[]{2}));
    }
}