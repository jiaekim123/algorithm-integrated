package codility.lesson.lesson1.binarygap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(5, new Solution().solution(1041));
        assertEquals(0, new Solution().solution(15));
        assertEquals(0, new Solution().solution(32));
        assertEquals(0, new Solution().solution(0));
        assertEquals(0, new Solution().solution(1));
    }
}