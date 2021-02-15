package programmers.courses30.lesson12903;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("c", new Solution().solution("abcde"));
        assertEquals("we", new Solution().solution("qwer"));
    }
}