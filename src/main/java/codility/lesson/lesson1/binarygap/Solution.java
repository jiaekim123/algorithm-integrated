/*
    https://app.codility.com/programmers/lessons/1-iterations/
    [Codility][literations] BinaryGap
 */
package codility.lesson.lesson1.binarygap;

class Solution {
    public int solution(int N) {
        char[] binNum = Integer.toBinaryString(N).toCharArray();
        return getMaxGap(binNum);
    }

    private int getMaxGap(char[] binNum) {
        int max = 0;
        int num = 0;
        char beforeChar = binNum[0];
        for (int i = 1; i < binNum.length; i++) {
            if (binNum[i] == beforeChar) {
                num++;
            } else {
                max = Math.max(max, num);
                num = 1;
            }
            beforeChar = binNum[i];
        }
        return max;
    }
}
