package programmers.courses30.lesson77484;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private final int MAX_LOTTO_COUNT = 6;
    private final int MAX_LOTTO_RANK = 6;

    public int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int unknownCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                unknownCount++;
                continue;
            }
            if (Arrays.stream(win_nums).anyMatch(value -> lotto == value)) {
                matchCount++;
            }
        }
        return getRankings(matchCount, unknownCount);
    }

    // 최고 순위 번호, 최저 순위 번호
    private int[] getRankings(int matchCount, int unknownCount) {
        Map<Integer, Integer> rankMap = initRankMap();
        int maxRanking = rankMap.get(matchCount + unknownCount);
        int minRanking = rankMap.get(matchCount);
        return new int[]{maxRanking, minRanking};
    }

    // count, rank
    private Map<Integer, Integer> initRankMap() {
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = MAX_LOTTO_COUNT; i >= 0; i--) {
            rankMap.put(i, MAX_LOTTO_COUNT - i + 1);
        }
        rankMap.put(0, MAX_LOTTO_RANK);
        return rankMap;
    }

}
