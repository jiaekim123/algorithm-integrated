package programmers.courses30.test.level2.question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(1, new Solution().solution("baabaa"));
        assertEquals(0, new Solution().solution("cdcd"));

        assertEquals(0, new Solution().solution("aaaaaaaaaaaaaaaabbbbbbbbbbbbb"));
    }
}