package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {

	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[]{-1};
		}

		int minNum = Arrays.stream(arr).min().orElse(0);
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			if (minNum != num) {
				list.add(num);
			}
		}

		if (list.size() == 0) {
			return new int[]{-1};
		}

		return list.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}

}
