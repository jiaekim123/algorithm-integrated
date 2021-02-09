/*
    https://programmers.co.kr/learn/courses/30/lessons/17682#
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 1차 다트게임
 */
package programmers.courses30.lesson17682;

class Solution {
    private static final int TOTAL_GAME = 3;

    public int solution(String dartResult) {
        char[] charResults = dartResult.toCharArray();
        int[] scores = new int[TOTAL_GAME];
        int game = 0;
        String num = new String();
        for (char charResult : charResults) {
            switch (charResult){
                case 'S':
                    scores[game] = Integer.parseInt(num);
                    num = "";
                    game++;
                    break;
                case 'D':
                    scores[game] = (int) Math.pow(Integer.parseInt(num), 2);
                    num = "";
                    game++;
                    break;
                case 'T':
                    scores[game] = (int) Math.pow(Integer.parseInt(num), 3);
                    num = "";
                    game++;
                    break;
                case '*':
                    if (game > 1) scores[game-2] = scores[game-2] * 2;
                    if (game > 0) scores[game-1] = scores[game-1] * 2;
                    break;
                case '#':
                    if (game > 0) scores[game-1] = scores[game-1] * -1;
                    break;
                default:
                    num = num  + charResult;
                    break;
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}