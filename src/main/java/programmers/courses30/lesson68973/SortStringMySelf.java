package programmers.courses30.lesson68973;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        List<WordInfo> words = new ArrayList<WordInfo>();
        
        for (String word : strings) {
        	WordInfo wordInfo = new WordInfo(word, word.charAt(n));
        	words.add(wordInfo);
        }
        Collections.sort(words);
        String[] answer = new String[words.size()];
        
        for (int i = 0; i<words.size(); i++) {
        	answer[i] = words.get(i).word;
        }
        return answer;
    }
    
}

class WordInfo implements Comparable<WordInfo>{
	String word;
	char alphabet;
	
	public WordInfo(String word, char alphabet) {
		this.word = word;
		this.alphabet = alphabet;
	}

	@Override
	public int compareTo(WordInfo o) {
		if (this.alphabet == o.alphabet) {
			return this.word.compareTo(o.word);
		}
		return this.alphabet - o.alphabet;
	}
}

public class SortStringMySelf {

	public static void main(String[] args) {
		String[] answerArr = new Solution().solution(new String[] {"sun", "bed", "car"}, 1);
		for (String answer : answerArr) {
			System.out.print(answer + " ");
		}
		
		String[] answerArr2 = new Solution().solution(new String[] {"abce", "abcd", "cdx"}, 2);
		for (String answer : answerArr2) {
			System.out.print(answer + " ");
		}
	}

}
