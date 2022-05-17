package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 재귀함수Test {

	재귀함수 재귀함수;

	@BeforeEach
	void init() {
		재귀함수 = new 재귀함수();
	}

	@Test
	void testCase01() {
		// given
		int n = 3;

		// when
		List<Integer> result = 재귀함수.solution(n);

		// then
		List<Integer> expected = List.of(1, 2, 3);
		assertThat(result).isEqualTo(expected);
	}

}