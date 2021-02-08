package programmers.courses30.lesson42840;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {1}, new Solution().solution(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals(new int[] {1, 2, 3}, new Solution().solution(new int[] {1, 3, 2, 4, 2}));
    }
}