package hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class CompateTheTriple {

	public static void main(String[] args) {
		System.out.println(compareTriplets(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8)));
	}

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> scoreList = Arrays.asList(0, 0);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				scoreList.set(0, scoreList.get(0) + 1);
			} else if (a.get(i) < b.get(i)) {
				scoreList.set(1, scoreList.get(1) + 1);
			}
		}

		return scoreList;
	}

}
