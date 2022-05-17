package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 이진수Test {

	이진수 이진수;

	@BeforeEach
	void init() {
		이진수 = new 이진수();
	}

	@Test
	void testCase01() {
		// given
		int n = 11;

		// when
		List<Integer> result = 이진수.solution(n);

		// then
		List<Integer> expected = List.of(1, 0, 1, 1);
		assertThat(result).isEqualTo(expected);
	}

}