package programmers.courses30.lesson68974;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        char[] skillArr = skill.toCharArray();
        for (String tree : skill_trees) {
        	char[] treeArr = tree.toCharArray();
        	if (isPosible(skillArr, treeArr)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPosible(char[] skillArr, char[] treeArr) {
    	int skillNum = 0;
    	for (int i = 0; i<treeArr.length; i++) {
    		for (int j = 0; j<skillArr.length; j++) {
    			if (treeArr[i] == skillArr[j]) {
    				if (j == skillNum) {
    					skillNum++;
    				} else {
    					return false;
    				}
    			}
    		}
    	}
		return true;
    }
}

public class SkillTree {
	public static void main(String[] args) {
		System.out.println(new Solution().solution("CBD", 
				new String[] {"BACDE", "CBADF", "AECG", "BDA"}));
	}
}
