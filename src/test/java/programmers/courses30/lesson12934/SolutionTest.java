package programmers.courses30.lesson12934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(144, new Solution().solution(121));
        assertEquals(-1, new Solution().solution(3));
    }
}