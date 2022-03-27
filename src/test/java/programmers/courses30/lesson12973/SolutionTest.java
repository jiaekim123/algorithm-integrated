package programmers.courses30.lesson12973;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 설명 :
 */
class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.solution("baabaa"));
        Assertions.assertEquals(0, solution.solution("cdcd"));
    }
}