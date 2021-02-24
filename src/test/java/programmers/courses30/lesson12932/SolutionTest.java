package programmers.courses30.lesson12932;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, new Solution().solution(12345));
    }
}