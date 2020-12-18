package programmers.courses30.lesson68980;

class Solution {
	private final static char FRONTBRACKET = '(';
    boolean solution(String s) {
        if (s.length()%2!=0) return false;
        char[] bracketArr = s.toCharArray();
        int front = 0, tail = 0;
        for (char bracket : bracketArr) {
        	if (bracket == FRONTBRACKET ) {
        		front++;
        	} else {
        		if (tail >= front) return false;
        		tail++;
        	}
        }
        if (front!=tail) return false;
        return true;
    }
}

public class CorrectBracket {
	public static void main(String[] args) {
		System.out.println(new Solution().solution("()()"));
		System.out.println(new Solution().solution("(())()"));
		System.out.println(new Solution().solution(")()("));
		System.out.println(new Solution().solution("(()("));
	}
}
