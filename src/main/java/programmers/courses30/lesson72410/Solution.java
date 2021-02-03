/*
    https://programmers.co.kr/learn/courses/30/lessons/72410
    [프로그래머스][2021 KAKAO BLIND RECRUITMENT] 신규 아이디 추천
 */
package programmers.courses30.lesson72410;

class Solution {
    // TODO: 정규표현식 REGEX를 이용한 static 중첩 클래스로 만들어서 풀어보기 ("[^a-z0-9\\-_.]" PATTERN)
    public String solution(String new_id) {
        String answer = "";
        // 1. 대문자 -> 소문자
        answer = new_id.toLowerCase();

        // 2. new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        char[] array = answer.toCharArray();
        StringBuilder sb = new StringBuilder();
        char before = array[0];
        for (char c : array) {
            // 3. new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
            if (before == '.' && c == '.') continue;

            // 45 : - , 46: ., 95: _ 48 ~ 57: 숫자, 97 ~ 122: 영소문자
            if (c == 45 || c == 46 || c == 95 || (48 <= c && c <= 57 ) || (97 <= c && c <= 122)){
                before = c;
                sb.append(c);
            }
        }
        answer = sb.toString();

        // 4. new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (answer.startsWith(".")){
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }

        // 5. new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.length() == 0){
            answer = "a";
        }

        // 6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        if (answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }

        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}