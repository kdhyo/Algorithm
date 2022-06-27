package level1.monthlycodechallenge;

import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {

	int[] numbers;
	Set<Integer> result = new HashSet<>();

	public int[] solution(int[] numbers) {
		this.numbers = numbers;

		dfs(0, 0, 0);

		return result.stream()
			.sorted().mapToInt(Integer::intValue)
			.toArray();
	}

	public void dfs(int idx, int sum, int count) {
		if (count == 2) {
			result.add(sum);
			return;
		}

		if (idx == this.numbers.length) {
			return;
		}

		dfs(idx + 1, sum + this.numbers[idx], count + 1);
		dfs(idx + 1, sum, count);
	}
}
