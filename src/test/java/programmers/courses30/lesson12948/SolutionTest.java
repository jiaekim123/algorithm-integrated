package programmers.courses30.lesson12948;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("*******4444", new Solution().solution("01033334444"));
        assertEquals("*****8888", new Solution().solution("027778888"));
    }
}