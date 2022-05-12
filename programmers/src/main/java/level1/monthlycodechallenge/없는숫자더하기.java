package level1.monthlycodechallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 없는숫자더하기 {

	public int solution(int[] numbers) {
		List<Integer> list = Arrays.stream(numbers)
			.boxed()
			.collect(Collectors.toList());

		return IntStream.rangeClosed(1, 9)
			.filter(num -> !list.contains(num))
			.sum();
	}

}
