package codility.lesson.lesson3.frogjump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(10, 85, 30));
        assertEquals(3, new Solution().solution(10, 10, 30));
    }
}