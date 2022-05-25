package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 바둑이승차Test {

	바둑이승차 바둑이승차;

	@BeforeEach
	void init() {
		바둑이승차 = new 바둑이승차();
	}

	@Test
	void testCase01() {
		// given
		int[] list = {81, 58, 42, 33, 61};

		// when
		int solution = 바둑이승차.solution(259, list);

		// then
		assertThat(solution).isEqualTo(242);
	}

}