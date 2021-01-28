package programmers.courses30.test2.question2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(1, new Solution().solution(9));
        assertEquals(4, new Solution().solution(15));
        assertEquals(2, new Solution().solution(41));
        assertEquals(1, new Solution().solution(1));

    }
}