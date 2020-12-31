/*
    https://app.codility.com/programmers/lessons/1-iterations/
    [codility][lesson1] iterations - BinaryGap
 */
package codility.lession1.literations;

class Solution {
    public int solution(int N) {
        int answer = 0;
        char[] binaries = Integer.toBinaryString(N).toCharArray();
        int gap = 0;
        for (char bin : binaries){
            if (bin=='1') {
                answer = Math.max(answer, gap);
                gap = 0;
            } else {
                gap++;
            }
        }
        return answer;
    }
}
