package programmers.courses30.lesson2609;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertArrayEquals(new String[] {"ICN", "JFK", "HND", "IAD"}, new Solution().solution(new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}));
        assertArrayEquals(new String[] {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}, new Solution().solution(new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}));

    }
}