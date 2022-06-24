package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

	int[] one = {1, 2, 3, 4, 5};
	int[] two = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
	int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

	public int[] solution(int[] answers) {
		int oneSize = one.length;
		int twoSize = two.length;
		int threeSize = three.length;
		int answersSize = answers.length;

		int[] answer = {0, 0, 0};

		for (int i = 0; i < answersSize; i++) {
			if (answers[i] == one[i % oneSize]) {
				answer[0]++;
			}

			if (answers[i] == two[i % twoSize]) {
				answer[1]++;
			}

			if (answers[i] == three[i % threeSize]) {
				answer[2]++;
			}
		}

		int max = Arrays.stream(answer).max().getAsInt();

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == max) {
				result.add(i + 1);
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		모의고사 sol = new 모의고사();
		sol.solution(new int[]{1,2,3,4,5});
	}

}
