/*
    https://programmers.co.kr/learn/courses/30/lessons/42883
    [프로그래머스][탐욕법] 큰 수 만들기
 */
package programmers.courses30.lesson42883;

class Solution {
    public String solution(String number, int k) {
        if (number.length() - k == 0) return "";
        StringBuilder sb = new StringBuilder(number.length() - k);
        char[] numbers = number.toCharArray();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            // k값이 count값과 같으면 if문을 거치지 않고 그냥 그대로 넣기.
            if (i < numbers.length - 1 && count < k) {
                // numbers[i] < numbers[i+1]일 때 count++하고 continue로 넘어가기 (numbers[i]는 없앨 숫자)
                if (numbers[i] < numbers[i + 1]) {
                    count++;

                    // string builder의 마지막 char의 아스키코드가 numbers[i+1]보다 작은지 확인 만약 작으면 count++하고 마지막꺼도 꺼내기 (반복해서 꺼내야 함)
                    while (sb.length() > 0 && sb.charAt(sb.length() - 1) < numbers[i + 1] && count < k) {
                        sb.deleteCharAt(sb.length() - 1);
                        count++;
                    }
                    continue;
                }
            }

            // numbers[i+1]가 없을 때 (i가 numbers.length-1과 같을 때) 그냥 넣기
            sb.append(numbers[i]);

        }

        while (count < k) {
            sb.deleteCharAt(sb.length() - 1);
            count++;
        }
        return sb.toString();
    }
}