/*
    https://programmers.co.kr/learn/courses/30/lessons/68646
    [프로그래머스][월간 코드 챌린지 시즌1] 풍선 터트리기 (level 3)
 */
package programmers.courses30.lesson68646;

class Solution {
    public int solution(int[] a) {
        int answer = 0;

        int left = Integer.MAX_VALUE, right= Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            // 왼쪽 끝 값보다 가운데에 작은 값이 있으면 answer를 올리고 left값을 a[i]로 바꾼다.
            if (a[i] < left) {
                answer++;
                left = a[i];
            }
            // 오른쪽 끝 값보다 가운데에 작은 값이 있으면 answer를 올리고 right값을 a[끝값-i]로 바꾼다.
            if (a[a.length - 1 - i] < right) {
                answer++;
                right = a[a.length - 1 - i];
            }

            // 가운데 중복 제외
            if (left == right) {
                answer--;
                break;
            }
        }

        return answer;
    }
}
