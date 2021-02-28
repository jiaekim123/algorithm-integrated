package programmers.courses30.lesson12949;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertArrayEquals(new int[][]{{15, 15}, {15, 15}, {15, 15}}, new Solution().solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}));
//        assertArrayEquals(new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}, new Solution().solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}));
        assertArrayEquals(new int[][]{{21, 24, 27}, {47, 54, 61}}, new Solution().solution(new int[][]{{1, 2}, {3, 4}}, new int[][]{{5, 6, 7}, {8, 9, 10}}));
    }
}