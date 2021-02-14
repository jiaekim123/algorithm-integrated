/*
    https://programmers.co.kr/learn/courses/30/lessons/12901
    [코딩테스트 연습][연습문제] 2016년
 */
package programmers.courses30.lesson12901;

class Solution {
    public String solution(int a, int b) {
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 1월 1일을 기준으로 a월 b일의 날짜 차이를 구한다.
        int days = 0;
        for (int i = 0; i < a - 1; i++){
            days += month[i];
        }
        days += b - 1;
        days += 5; // 2016년 1월 1일은 금요일
        // 날짜 차이에 대해 요일을 반환받는다. (7로 나눈 나머지)
        return week[days%7];
    }
}
