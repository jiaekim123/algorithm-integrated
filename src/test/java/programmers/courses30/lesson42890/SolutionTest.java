package programmers.courses30.lesson42890;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2, new Solution().solution(new String[][] {{"100","ryan","music","2"}, {"200","apeach","math","2"}, {"300","tube","computer","3"},
                {"400","con","computer","4"}, {"500","muzi","music","3"}, {"600","apeach","music","2"}}));
    }
}