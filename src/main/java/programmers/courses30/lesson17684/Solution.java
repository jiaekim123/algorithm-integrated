/*
    https://programmers.co.kr/learn/courses/30/lessons/17684
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 3차 압축 (level 2)
 */
package programmers.courses30.lesson17684;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answers = new LinkedList<>();
        char[] cMsg = msg.toCharArray();
        Dictionary dictionary = new Dictionary();

        for (int i = 0; i < cMsg.length; i++) {
            StringBuilder sb = new StringBuilder();
            int index;
            for (int j = i; j<cMsg.length; j++){
                sb.append(cMsg[j]);
                index = dictionary.checkDictionary(sb.toString());
                if (index == -1){
                    dictionary.pushNewWord(sb.toString());
                    i = j - 1;
                    break;
                } else {
                    if (i != j) answers.remove(answers.size()-1);
                    answers.add(index+1);
                    if (j == cMsg.length - 1) return getAnswer(answers);
                }
            }
        }

        return getAnswer(answers);
    }
    private int[] getAnswer(List<Integer> answers){
        int[] answer = new int[answers.size()];
        for (int i = 0; i<answers.size(); i++){
            answer[i] = answers.get(i);
        }
        return answer;
    }
}
class Dictionary {
    private List<String> elements;

    public Dictionary (){
        elements = new ArrayList<>();
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++){
            elements.add(String.valueOf(alphabet));
        }
    }

    public void pushNewWord(String word){
        elements.add(word);
    }
    public int checkDictionary(String word){
        return elements.indexOf(word);
    }
}