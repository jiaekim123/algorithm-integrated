package programmers.courses30.lesson42579;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {4, 1, 3, 0}, new Solution().solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
        assertArrayEquals(new int[] {4, 1, 3, 0, 2}, new Solution().solution(new String[] {"classic", "pop", "piano", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
    }
}