package programmers.courses30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(4, new Solution().solution("hit", "cog", new String[] { "hot", "dot", "dog", "lot", "log", "cog" }));
        assertEquals(0, new Solution().solution("hit", "cog", new String[] { "hot", "dot", "dog", "lot", "log" }));
    }
}