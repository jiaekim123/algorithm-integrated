package programmers.courses30.lesson12944;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2.5, new Solution().solution(new int[]{1, 2, 3, 4}));
        assertEquals(5, new Solution().solution(new int[]{5, 5}));
    }
}