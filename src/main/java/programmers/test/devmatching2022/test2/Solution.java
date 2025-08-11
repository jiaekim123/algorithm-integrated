package programmers.test.devmatching2022.test2;

class Solution {
    public int solution(String[] grid) {
        int answer = -1;
        // DFS
        // 배열을 순회하면서 ? 인지 확인한다.
        // ? 일 경우 a, b, c중 하나를 넣어본다.
        // x를 +1 해보거나 y를 +1 해보았을 때 동일한 문자인지 확인한다.
        // 만약 동일한 문자가 아니면 해당 좌표와 값을 저장해둔다. (다음에 거기부터 시작)
        // 동일한 문자면 다음 x, y를 +1씩 해보고 맵이 끝날 때 / 혹은 다른 문자가 나올때까지 전진
        // 이미 나온 다른 문자가 있는 경우 해당 DFS는 실패 -> 다음 ? 조건 변경해서 확인
        return answer;
    }
}