package programmers.courses30.lesson42885;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(new int[] {70, 50, 80, 50}, 100));
        assertEquals(3, new Solution().solution(new int[] {70, 80, 50}, 100));
    }
}