package programmers.test.devmatching.test1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class Solution {
    // FIXME: *에 두 번 마주쳐야 못가는거였음;; 나중에 풀어보자 걍;;
    public int solution(String[] drum) {
        int lineCount = drum[0].length();
        int[] liveLine = initMap(drum, lineCount);
        for (String row : drum) {
            byte[] rowByteArray = row.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < lineCount; i++) {
                byte rowByte = rowByteArray[i];
                if (rowByte == '*') {
                    liveLine[i] = 0;
                } else if (rowByte == '>') {
                    liveLine[i + 1] = liveLine[i] + liveLine[i + 1];
                    liveLine[i] = 0;
                } else if (rowByte == '<') {
                    for (int j = i - 1; j >= 0; j--) {
                        if (rowByteArray[j] == '#') {
                            liveLine[j] = liveLine[i];
                            liveLine[i] = 0;
                            break;
                        } else if (rowByteArray[j] == '*') {
                            liveLine[i] = 0;
                            break;
                        }
                    }
                }
            }
        }
        return Arrays.stream(liveLine).sum();
    }

    private int[] initMap(String[] drum, int lineCount) {
        int[] liveLine = new int[lineCount];
        for (int i = 0; i < lineCount; i++) {
            liveLine[i] = 1;
        }
        return liveLine;
    }
}