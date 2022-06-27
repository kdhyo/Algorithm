package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

	public int[] solution(int[] arr, int divisor) {
		List<Integer> nums = new ArrayList<>();
		for (int num : arr) {
			if (num % divisor == 0) {
				nums.add(num);
			}
		}
		if (nums.isEmpty()) {
			return new int[]{-1};
		}

		Collections.sort(nums);
		int[] answer = new int[nums.size()];
		for (int i = 0; i < nums.size(); i++) {
			answer[i] = nums.get(i);
		}
		return answer;
	}

	/**
	 * filter 를 계속 까먹는다. 계속 상기시키자.
	 */
	public int[] solution2(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		if (answer.length == 0) {
			answer = new int[]{-1};
		}
		Arrays.sort(answer);
		return answer;
	}

}
