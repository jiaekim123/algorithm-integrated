package programmers.courses30.lesson42576;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("leo", new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        assertEquals("vinko", new Solution().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
        assertEquals("mislav", new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }
}