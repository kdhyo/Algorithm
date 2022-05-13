package level2.dfsbfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 타겟넘버Test {

	타겟넘버 타겟넘버;

	@BeforeEach
	void init() {
		타겟넘버 = new 타겟넘버();
	}

	@Test
	void testCase01() {
		// given
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;

		// when
		int result = 타겟넘버.solution(numbers, target);

		// then
		int expected = 5;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase02() {
		// given
		int[] numbers = {1, 1, 1};
		int target = 1;

		// when
		int result = 타겟넘버.solution(numbers, target);

		// then
		int expected = 3;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase03() {
		// given
		int[] numbers = {4, 1, 2, 1};
		int target = 4;

		// when
		int result = 타겟넘버.solution(numbers, target);

		// then
		int expected = 2;
		assertThat(result).isEqualTo(expected);
	}

}