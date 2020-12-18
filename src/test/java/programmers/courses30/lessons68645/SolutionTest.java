package programmers.courses30.lessons68645;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}, new Solution().solution(4));
        assertArrayEquals(new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}, new Solution().solution(5));
        assertArrayEquals(new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11}, new Solution().solution(6));
    }
}