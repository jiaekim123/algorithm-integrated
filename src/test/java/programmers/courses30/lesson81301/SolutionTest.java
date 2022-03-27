package programmers.courses30.lesson81301;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        Assertions.assertEquals(1478, solution.solution("one4seveneight"));
        Assertions.assertEquals(234567, solution.solution("23four5six7"));
        Assertions.assertEquals(234567, solution.solution("2three45sixseven"));
        Assertions.assertEquals(123, solution.solution("123"));
    }
}