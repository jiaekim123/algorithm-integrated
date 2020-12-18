package programmers.courses30.lesson68981;

import java.util.HashMap;

class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> participantMap = new HashMap<String, Integer>();
		for (String player : participant) {
			Integer playerCount = participantMap.getOrDefault(player, 0);
			if (playerCount != 0) {
				participantMap.replace(player, playerCount + 1);
			} else {
				participantMap.put(player, 1);
			}
		}
		
		for (String player : completion) {
			Integer playerCount = participantMap.getOrDefault(player, 0);
			if (playerCount > 1) {
				participantMap.replace(player, playerCount - 1);
			} else {
				participantMap.remove(player);
			}
		}
		return participantMap.keySet().iterator().next();
	}
}

public class NotFinishedPlayer {
	public static void main(String[] args) {
		System.out.println(
				new Solution().solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
	}
}
