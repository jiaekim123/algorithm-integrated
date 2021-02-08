package programmers.courses30.lesson42626;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
    }
}