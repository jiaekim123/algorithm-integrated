/*
    https://programmers.co.kr/learn/courses/30/lessons/72410
    [프로그래머스][2021 KAKAO BLIND RECRUITMENT] 신규 아이디 추천
 */
package programmers.courses30.lesson72410;

class Solution {
    public String solution(String new_id) {
        String answer = new IdMaker(new_id)
                .replaceToLowerCase()
                .replacePattern()
                .replaceSingleDot()
                .replaceStartEndDot()
                .replaceEmptyString()
                .replaceGreaterThan16()
                .replaceLessThan2()
                .getId();

        return answer;
    }

    private static class IdMaker {
        private String id;

        IdMaker(String id) {
            this.id = id;
        }

        // 1. 대문자 -> 소문자
        private IdMaker replaceToLowerCase(){
            id = id.toLowerCase();
            return this;
        }

        // 2. id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        private IdMaker replacePattern(){
            id = id.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        // 3. id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        private IdMaker replaceSingleDot(){
            id = id.replaceAll("[.]{2,}", ".");
            return this;
        }

        // 4. id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        private IdMaker replaceStartEndDot(){
            id = id.replaceAll("^[.]|[.]$","");
            return this;
        }

        // 5. id가 빈 문자열이라면, id에 "a"를 대입합니다.
        private IdMaker replaceEmptyString(){
            id = id.isEmpty() ? "a" : id;
            return this;
        }

        // 6. id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        private IdMaker replaceGreaterThan16(){
            if (id.length() > 15) {
                id = id.substring(0, 15);
            }
            id = id.replaceAll("[.]$", "");
            return this;
        }

        // 7. id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        private IdMaker replaceLessThan2(){
            while (id.length() < 3) {
                id += id.charAt(id.length()-1);
            }
            return this;
        }

        private String getId(){
            return id;
        }

    }

}