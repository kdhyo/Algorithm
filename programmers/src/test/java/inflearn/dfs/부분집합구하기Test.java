package inflearn.dfs;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 부분집합구하기Test {

	부분집합구하기 부분집합구하기;

	@BeforeEach
	void init() {
		부분집합구하기 = new 부분집합구하기();
	}

	@Test
	void testCase01() {
		// given
		int n = 11;

		// when
		// then
		List<String> solution = 부분집합구하기.solution(3);
		System.out.println(solution);
	}

}