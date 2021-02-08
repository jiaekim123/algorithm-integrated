package programmers.courses30.lesson42862;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(5, new Solution().solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        assertEquals(4, new Solution().solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        assertEquals(2, new Solution().solution(3, new int[] { 3 }, new int[] { 1 }));
    }
}