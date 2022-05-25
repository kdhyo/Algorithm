package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 합이같은부분집합Test {

	합이같은부분집합 합이같은부분집합;

	@BeforeEach
	void init() {
		합이같은부분집합 = new 합이같은부분집합();
	}

	@Test
	void testCase01() {
		// given
		List<Integer> list = List.of(1, 3, 5, 6, 7, 10);

		// when
		String solution = 합이같은부분집합.solution(list);
		System.out.println(solution);

		// then
		assertThat(solution).isEqualTo("YES");
	}

}