package programmers.courses30.lesson1835;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        Assertions.assertEquals(3648, solution.solution(2, new String[]{"N~F=0", "R~T>2"}));
        Assertions.assertEquals(0, solution.solution(2, new String[]{"M~C<2", "C~M>1"}));

    }
}