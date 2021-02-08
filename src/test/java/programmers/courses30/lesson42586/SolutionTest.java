package programmers.courses30.lesson42586;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 1}, new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        assertArrayEquals(new int[]{1, 3, 2}, new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}