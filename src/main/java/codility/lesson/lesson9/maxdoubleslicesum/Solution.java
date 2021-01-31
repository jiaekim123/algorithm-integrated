package codility.lesson.lesson9.maxdoubleslicesum;

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        // 최소값을 찾는다. (top 2개)
        // 0번째부터 시작 (이후 -값이 있으면 그것부터 시작)
        int first = 0;
        for (int i = 0; i<A.length; i++){
            if (A[i+1]<0) first++;
            else break;
        }




        return answer;
    }
}
