/*
    https://programmers.co.kr/learn/courses/30/lessons/12916
    [프로그래머스][연습문제] 문자열 내 p와 y개수
 */
package programmers.courses30.lesson12916;

import java.util.HashMap;
import java.util.Map;

class Solution {
    boolean solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars) {
            switch (c){
                case 'p':
                    map.merge('p', 1, Integer::sum);
                    break;
                case 'y':
                    map.merge('y', 1, Integer::sum);
                    break;
            }
        }
        return map.get('p') == map.get('y') ? true : false;
        // return s.chars().filter( e -> 'p'== e).count() == s.chars().filter( e -> 'y'== e).count();
    }
}