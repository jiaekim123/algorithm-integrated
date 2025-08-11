package programmers.test.devmatching.test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(4, new Solution().solution(new String[]{"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"}));
        Assertions.assertEquals(6, new Solution().solution(new String[]{"######", "######", "######", "######", "######", "######"}));
        Assertions.assertEquals(6, new Solution().solution(new String[]{"######", "######", "######", "######", ">>>>>#", "######"}));
        Assertions.assertEquals(0, new Solution().solution(new String[]{"******", "######", "######", "######", ">>>>>#", "######"}));
        Assertions.assertEquals(0, new Solution().solution(new String[]{"######", ">>>#<<", "###*##", "######", "######", "######"}));
        Assertions.assertEquals(0, new Solution().solution(new String[]{"######", "#<<<<<", "*#####", "######", "######", "######"}));
        Assertions.assertEquals(0, new Solution().solution(new String[]{"######", ">>>*<<", "######", "######", "######", "######"}));
    }
}