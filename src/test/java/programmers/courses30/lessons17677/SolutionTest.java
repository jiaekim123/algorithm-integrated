package programmers.courses30.lessons17677;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(16384, new Solution().solution("FRANCE", "french"));
        assertEquals(65536, new Solution().solution("handshake", "shake hands"));
        assertEquals(43690, new Solution().solution("aa1+aa2", "AAAA12"));
        assertEquals(65536, new Solution().solution("E=M*C^2", "e=m*c^2"));
    }
}