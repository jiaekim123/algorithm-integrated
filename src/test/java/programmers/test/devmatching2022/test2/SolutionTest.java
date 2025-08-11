package programmers.test.devmatching2022.test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(2, new Solution().solution(new String[]{"??b", "abc", "cc?"}));
        Assertions.assertEquals(0, new Solution().solution(new String[]{"abcabcab", "????????"}));
        Assertions.assertEquals(3, new Solution().solution(new String[]{"aa?"}));
    }
}