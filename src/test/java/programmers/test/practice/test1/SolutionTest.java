package programmers.test.practice.test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void solution() {
        Assertions.assertEquals(new int[]{1, 10}, new Solution().solution(new int[][]{{1, 4}, {3, 4}, {3, 10}}));
        Assertions.assertEquals(new int[]{2, 1}, new Solution().solution(new int[][]{{1, 1}, {2, 2}, {1, 2}}));
    }

}