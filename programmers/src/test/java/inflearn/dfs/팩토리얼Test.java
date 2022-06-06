package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 팩토리얼Test {

	팩토리얼 팩토리얼;

	@BeforeEach
	void init() {
		팩토리얼 = new 팩토리얼();
	}

	@Test
	void testCase01() {
		// given
		int n = 5;

		// when
		int solution = 팩토리얼.solution(n);

		// then
		assertThat(solution).isEqualTo(120);
	}
}