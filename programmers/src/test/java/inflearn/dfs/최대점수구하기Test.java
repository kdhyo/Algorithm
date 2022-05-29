package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 최대점수구하기Test {

	최대점수구하기 최대점수구하기;

	@BeforeEach
	void init() {
		최대점수구하기 = new 최대점수구하기();
	}

	@Test
	void testCase01() {
		// given
		int limit = 20;
		int[][] score = {{10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}};

		// when
		int result = 최대점수구하기.solution(limit, score);

		// then
		assertThat(result).isEqualTo(41);
	}

}