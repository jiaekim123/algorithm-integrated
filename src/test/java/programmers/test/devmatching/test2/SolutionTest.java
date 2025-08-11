package programmers.test.devmatching.test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(7, new Solution().solution(2, new String[]{"A 3", "B 2"}, new String[]{"A 1", "A 2", "B 3", "B 4"}));
        Assertions.assertEquals(12, new Solution().solution(3, new String[]{"SPAGHETTI 3", "FRIEDRICE 2", "PIZZA 8"}, new String[]{"PIZZA 1", "FRIEDRICE 2", "SPAGHETTI 4", "SPAGHETTI 6", "PIZZA 7", "SPAGHETTI 8"}));
        Assertions.assertEquals(310000, new Solution().solution(1, new String[]{"COOKIE 10000"}, new String[]{"COOKIE 300000"}));
    }
}