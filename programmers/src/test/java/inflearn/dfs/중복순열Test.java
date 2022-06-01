package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 중복순열Test {

	중복순열 중복순열;

	@BeforeEach
	void init() {
		중복순열 = new 중복순열();
	}

	@Test
	void testCase01() {
		// given
		int n = 4;
		int m = 3;

		// when
		List<String> solution = 중복순열.solution(n, m);

		// then
		for (String s : solution) {
			System.out.println(s);
		}
//		assertThat(solution).hasSize(9);
	}


}