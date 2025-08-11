package programmers.test.devmatching.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(23, new Solution().solution("abcc"));
        Assertions.assertEquals(52, new Solution().solution("tooth"));
        Assertions.assertEquals(0, new Solution().solution("zzz"));
    }
}