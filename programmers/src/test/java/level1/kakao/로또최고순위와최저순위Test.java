package level1.kakao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 로또최고순위와최저순위Test {

	로또최고순위와최저순위 로또최고순위와최저순위;

	@BeforeEach
	void init() {
		로또최고순위와최저순위 = new 로또최고순위와최저순위();
	}

	@Test
	void testCase01() {
		// given
		int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
		int[] winNums = new int[]{31, 10, 45, 1, 6, 19};

		// when
		int[] result = 로또최고순위와최저순위.solution(lottos, winNums);

		// then
		int[] expected = new int[]{3, 5};
		assertThat(result).isEqualTo(expected);
	}

}
