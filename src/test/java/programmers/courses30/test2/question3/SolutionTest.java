package programmers.courses30.test2.question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[] {1,2,3,5,4}, new Solution().solution(5, new int[][] {{1, 3}, {1, 4}, {3, 5}, {5, 4}}));
    }
}