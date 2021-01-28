package codility.never.test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("ab", new Solution().solution("abc"));
        assertEquals("ho", new Solution().solution("hot"));
        assertEquals("cdility", new Solution().solution("codility"));
        assertEquals("aaa", new Solution().solution("aaaa"));
    }
}