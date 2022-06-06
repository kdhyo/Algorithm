package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 메모이제이션Test {

	메모이제이션 메모이제이션;

	@BeforeEach
	void init() {
		메모이제이션 = new 메모이제이션();
	}

	@Test
	void testCase01() {
		// given
		int n = 5;
		int r = 3;

		// when
		int solution = 메모이제이션.solution(n, r);

		// then
		assertThat(solution).isEqualTo(10);
	}

	@Test
	void testCase02() {
		// given
		int n = 33;
		int r = 19;

		// when
		int solution = 메모이제이션.solution(n, r);

		// then
		assertThat(solution).isEqualTo(818809200);
	}
}
