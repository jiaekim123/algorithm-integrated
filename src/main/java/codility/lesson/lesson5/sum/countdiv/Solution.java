package codility.lesson.lesson5.sum.countdiv;

class Solution {
    public int solution(int A, int B, int K) {
        int answer = 0;
        int i;
        for (i = A; i <= B; i++) {
            if (i % K == 0){
                answer++;
                answer += (B - i) / K;
                break;
            }
        }
        return answer;
    }
}
