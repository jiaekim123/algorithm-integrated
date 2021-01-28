package programmers.courses30.test2.question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3, new Solution().solution(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 1, 0}}, 2));
        assertEquals(1, new Solution().solution(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}, 2));
    }
}