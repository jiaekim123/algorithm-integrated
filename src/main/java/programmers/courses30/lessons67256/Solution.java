/*
    https://programmers.co.kr/learn/courses/30/lessons/67256
    [프로그래머스][2020카카오 인턴십] 키패드 누르기
 */
package programmers.courses30.lessons67256;

class Solution {
    final private static int X = 0;
    final private static int Y = 1;
    final private static String LEFT = "left";
    final private static String RIGHT = "right";
    final private static int ZERO = 11;
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] left = new int[]{0,3}; // *
        int[] right = new int[]{2,3}; // #

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                moveLeftHand(sb, left, numbers[i]);
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                moveRightHand(sb, right, numbers[i]);
            } else {
                int x, y, left_dist, right_dist;
                if (numbers[i] == 0) {
                    numbers[i] = ZERO;
                }

                x = (numbers[i] - 1) % 3;
                y = (numbers[i] - 1) / 3;

                left_dist = Math.abs(x - left[X]) + Math.abs(y - left[Y]);
                right_dist = Math.abs(x - right[X]) + Math.abs(y - right[Y]);
                if (left_dist < right_dist) {
                    moveLeftHand(sb, left, numbers[i]);
                } else if (left_dist > right_dist) {
                    moveRightHand(sb, right, numbers[i]);
                } else {
                    if (hand.equals(LEFT)) moveLeftHand(sb, left, numbers[i]);
                    else moveRightHand(sb, right, numbers[i]);
                }
            }
        }
        return sb.toString();
    }
    private void moveLeftHand(StringBuilder sb, int[] left, int number){
        sb.append("L");
        left[X] = (number - 1) % 3;
        left[Y] = (number - 1) / 3;
    }
    private void moveRightHand(StringBuilder sb, int[] right, int number){
        sb.append("R");
        right[X] = (number - 1) % 3;
        right[Y] = (number - 1) / 3;
    }
}
