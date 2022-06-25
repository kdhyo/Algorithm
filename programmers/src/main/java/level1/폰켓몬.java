package level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 폰켓몬 {

	public int solution(int[] nums) {
		Set<Integer> collect = Arrays.stream(nums).boxed()
			.collect(Collectors.toSet());
		int i = nums.length / 2;

		return Math.min(collect.size(), i);
	}

}
