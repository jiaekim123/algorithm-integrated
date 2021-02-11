package programmers.courses30.lesson17678;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("09:00", new Solution().solution(1, 1, 5, new String[] {"08:00", "08:01", "08:02", "08:03"}));
        assertEquals("09:09", new Solution().solution(2, 10, 2, new String[] {"09:10", "09:09", "08:00"}));
        assertEquals("08:59", new Solution().solution(2, 1, 2, new String[] {"09:00", "09:00", "09:00", "09:00"}));
        assertEquals("00:00", new Solution().solution(1, 1, 5, new String[] {"00:01", "00:01", "00:01", "00:01", "00:01"}));
        assertEquals("09:00", new Solution().solution(1, 1, 1, new String[] {"23:59"}));
        assertEquals("18:00", new Solution().solution(10, 60, 45, new String[] {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
        assertEquals("18:00", new Solution().solution(10, 60, 5, new String[] {"9:00", "10:05", "17:55", "18:00",  "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
        assertEquals("18:00", new Solution().solution(10, 60, 5, new String[] {"9:00", "10:05", "17:55", "18:00",  "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
        assertEquals("09:00", new Solution().solution(1, 1, 5, new String[] {"00:01", "00:01", "00:01", "00:01", "09:05"}));
    }
}