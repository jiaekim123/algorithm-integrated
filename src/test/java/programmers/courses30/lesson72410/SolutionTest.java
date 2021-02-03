package programmers.courses30.lesson72410;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertEquals("bat.y.abcdefghi", new Solution().solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", new Solution().solution("z-+.^."));
        assertEquals("aaa", new Solution().solution("=.="));
        assertEquals("123_.def", new Solution().solution("123_.def"));
        assertEquals("abcdefghijklmn", new Solution().solution("abcdefghijklmn.p"));
    }
}