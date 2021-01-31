package programmers.courses30.lesson60057;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(7, new Solution().solution("aabbaccc"));
        assertEquals(9, new Solution().solution("ababcdcdababcdcd"));
        assertEquals(8, new Solution().solution("abcabcdede"));
        assertEquals(14, new Solution().solution("abcabcabcabcdededededede"));
        assertEquals(17, new Solution().solution("xababcdcdababcdcd"));
        assertEquals(5, new Solution().solution("xxxxxxxxxxyyy"));
        assertEquals(1, new Solution().solution("a"));
    }
}