package programmers.courses30.lesson42628;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{0, 0}, new Solution().solution(new String[]{"I 16", "D 1"}));
        assertArrayEquals(new int[]{7, 5}, new Solution().solution(new String[]{"I 7", "I 5", "I -5", "D -1"}));
        assertArrayEquals(new int[]{0, 0}, new Solution().solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}));
        assertArrayEquals(new int[]{333, -45}, new Solution().solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}));
    }
}