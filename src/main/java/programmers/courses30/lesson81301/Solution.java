package programmers.courses30.lesson81301;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * 2021 카카오 채용연계형 인턴십
 * 숫자 문자열과 영단어
 */
class Solution {
    public int solution(String s) {

        char[] chars = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
        for (char ch : chars) {
            if (Character.isAlphabetic(ch)) {
                alphabets.append(ch);
                try {
                    NUMBER number = NUMBER.valueOf(alphabets.toString());
                    answer.append(number.getNum());
                    alphabets.delete(0, alphabets.length());
                } catch (Exception ignored) {

                }
            } else {
                answer.append(ch);
            }
        }

        return Integer.parseInt(answer.toString());
    }
}

enum NUMBER {
    zero(0, "zero"),
    one(1, "one"),
    two(2, "two"),
    three(3, "three"),
    four(4, "four"),
    five(5, "five"),
    six(6, "six"),
    seven(7, "seven"),
    eight(8, "eight"),
    nine(9, "nine"),
    ;
    private final int num;
    private final String word;

    NUMBER(int num, String word) {
        this.num = num;
        this.word = word;
    }

    public int getNum() {
        return num;
    }

    public String getWord() {
        return word;
    }
}