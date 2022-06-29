package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 자연수뒤집어배열로만들기 {

	public int[] solution(long n) {
		List<Long> nums = new ArrayList<>();
		while(n != 0) {
			nums.add(n % 10);
			n /= 10;
		}

		return nums.stream()
			.mapToInt(Long::intValue)
			.toArray();
	}

}
