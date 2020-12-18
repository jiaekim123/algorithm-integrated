package programmers.courses30.lesson68970;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[] {0,0};
        List<String> answerList = new ArrayList<String>();
        
        for (int i = 0; i<words.length; i++) {
        	if (answerList.contains(words[i]) || 
        			(i>0 && (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)))){
        		answer[0] = (i+1) - ((i/n)*n); // 번호
        		answer[1] = i/n + 1; // 차례
        		break;
        	}
        	answerList.add(words[i]);
        }
        return answer;
    }
}

public class EnglishEnding {

	public static void main(String[] args) {
		int [] answer = new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
		int [] answer2 = new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize",
														"encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});

		int [] answer3 = new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
		System.out.println(answer[0] +","+ answer[1]);
		System.out.println(answer2[0] +","+ answer2[1]);
		System.out.println(answer3[0] +","+ answer3[1]);
	}

}
