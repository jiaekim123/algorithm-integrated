package programmers.courses30.lesson12906;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {1, 3, 0, 1}, new Solution().solution(new int[] {1, 1, 3, 3, 0, 1, 1}));
        assertArrayEquals(new int[] {4, 3}, new Solution().solution(new int[] {4, 4, 4, 3, 3}));
    }
}