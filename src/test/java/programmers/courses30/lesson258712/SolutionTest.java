package programmers.courses30.lesson258712;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 설명 :
 *
 * @author 김지애(Nova) / jiae.kim413@dreamus.io
 * @since 2024/08/11
 */
class SolutionTest {


    @Test
    void solution() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(new int[]{2, 1, 1, 0},
                solution.solution(
                        new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                        2));
        Assertions.assertArrayEquals(new int[]{0, 0},
                solution.solution(
                        new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                        3));
    }
}