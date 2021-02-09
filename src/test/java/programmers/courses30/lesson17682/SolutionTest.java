package programmers.courses30.lesson17682;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertEquals(37, new Solution().solution("1S2D*3T"));
        assertEquals(9, new Solution().solution("1D2S#10S"));
        assertEquals(3, new Solution().solution("1D2S0T"));
        assertEquals(23, new Solution().solution("1S*2T*3S"));
        assertEquals(5, new Solution().solution("1D#2S*3S"));
        assertEquals(-4, new Solution().solution("1T2D3D#"));
        assertEquals(59, new Solution().solution("1D2S3T*"));

    }
}