package programmers.courses30.lesson12922;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("수박수", new Solution().solution(3));
        assertEquals("수박수박", new Solution().solution(4));
    }
}