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

	/***
	 * 1~9 를 다 더한 후 (45)에서 인수를 빼는 생각의 전환이 멋졌음.
	 */
	public int solution2(int[] numbers) {
		int sum = 45;
		for (int i : numbers) {
			sum -= i;
		}
		return sum;
	}

	public int solution3(int[] numbers) {
		return 45 - Arrays.stream(numbers).sum();
	}

}
