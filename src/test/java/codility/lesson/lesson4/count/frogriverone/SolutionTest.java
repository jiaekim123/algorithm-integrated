package codility.lesson.lesson4.count.frogriverone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(6, new Solution().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}