package level1.monthlycodechallenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 없는숫자더하기Test {

	없는숫자더하기 없는숫자더하기;

	@BeforeEach
	void init() {
		없는숫자더하기 = new 없는숫자더하기();
	}

	@Test
	void testCase01() {
		// given
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

		// when
		int result = 없는숫자더하기.solution(numbers);

		// then
		int expected = 14;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase02() {
		// given
		int[] numbers = {5, 8, 4, 0, 6, 7, 9};

		// when
		int result = 없는숫자더하기.solution(numbers);

		// then
		int expected = 6;
		assertThat(result).isEqualTo(expected);
	}

}