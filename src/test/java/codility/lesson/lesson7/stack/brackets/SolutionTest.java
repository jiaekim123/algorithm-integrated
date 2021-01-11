package codility.lesson.lesson7.stack.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(1, new Solution().solution("{[()()]}"));
        assertEquals(0, new Solution().solution("{[)()]}"));
        assertEquals(0, new Solution().solution("([)()]"));
    }
}