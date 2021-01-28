package programmers.courses30.test2.question1;

class Solution {
    public int solution(int[][] office, int k) {
        final int OFFICE_LENGTH_X = office.length;
        final int OFFICE_LENGTH_Y = office[0].length;
        int answer = 0;
        for (int x = 0; x < OFFICE_LENGTH_X; x++) {
            for (int y = 0; y < OFFICE_LENGTH_Y; y++) {
                int count = 0;
                for (int i = x; i < x + k && i < OFFICE_LENGTH_X; i++) {
                    for (int j = y; j < y + k && j < OFFICE_LENGTH_Y; j++) {
                        if (office[i][j] == 1) count++;
                    }
                }
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }

}