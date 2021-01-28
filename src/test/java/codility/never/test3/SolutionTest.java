package codility.never.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(7, new Solution().solution(2014, "April", "May", "Wednesday"));
        assertEquals(8, new Solution().solution(2012, "July", "August", "Sunday"));
        assertEquals(3, new Solution().solution(2012, "February", "February", "Sunday"));
        assertEquals(4, new Solution().solution(2012, "July", "July", "Sunday"));
    }
}