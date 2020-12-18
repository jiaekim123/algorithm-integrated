package programmers.courses30.lesson68985;

import java.util.HashMap;

class Solution {
	private static final int CLOTHES_TYPE = 1;

	public int solution(String[][] clothes) {
		int answer = 1;

		// Hashmap<종류, 갯수>
		HashMap<String, Integer> clothesHashMap = new HashMap<String, Integer>();
		for (String[] clothe : clothes) {
			int clothesCount = clothesHashMap.getOrDefault(clothe[CLOTHES_TYPE], 0);
			if (clothesCount == 0) {
				clothesHashMap.put(clothe[CLOTHES_TYPE], 1);
			} else {
				clothesHashMap.replace(clothe[CLOTHES_TYPE], clothesCount + 1);
			}
		}
		for (Integer value : clothesHashMap.values()) {
			answer *= (value + 1);
		}
		return answer - 1;
	}
}

public class Comouflage {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new String[][] { { "yellow_hat", "headgear" },
				{ "blue_sunglasses", "eyewear" }, { "green_turban", "headgear" } }));
	}
}
