/*
    https://programmers.co.kr/learn/courses/30/lessons/42842
    [프로그래머스][완전탐색] 카펫 (level 2)
 */
package programmers.courses30.lessons42842;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++){
            if (yellow % i == 0) {
                int j = yellow / i;
                if (brown == (i * 2 + j * 2 + 4)){
                    answer[0] = i + 2;
                    answer[1] = j + 2;
                    if (i >= j) break;
                }
            }
        }
        return answer;
    }
}