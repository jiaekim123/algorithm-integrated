package codility.never.test1;

class Solution {
    public String solution(String S) {
        String answer = "";

        // sub one by one to make a word and put smaller words in the answer
        answer = S.substring(1, S.length());
        for (int i = 1; i < S.length() - 1; i++) {
            String newS = S.substring(0, i) + S.substring(i + 1, S.length());
            answer = answer.compareTo(newS) < 0 ? answer : newS;
        }
        answer = answer.compareTo(S.substring(0, S.length() - 1)) < 0 ? answer : S.substring(0, S.length() - 1);
        return answer;
    }
}
