package programmers.courses30.lesson42587;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(1, new Solution().solution(new int[] {2, 1, 3, 2}, 2));
        assertEquals(5, new Solution().solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }
}