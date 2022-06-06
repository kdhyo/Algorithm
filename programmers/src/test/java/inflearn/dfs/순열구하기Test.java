package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 순열구하기Test {

	순열구하기 순열구하기;

	@BeforeEach
	void init() {
		순열구하기 = new 순열구하기();
	}

	@Test
	void testCase01() {
		// given
		int m = 2;
		int[] arr = {3, 6, 9};

		// when
		List<String> solution = 순열구하기.solution(m, arr);

		// then
		for (String s : solution) {
			System.out.println("s = " + s);
		}
		assertThat(solution).hasSize(6);
	}

}