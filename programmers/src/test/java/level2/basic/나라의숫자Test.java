package level2.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 나라의숫자Test {

	나라의숫자 나라의숫자;

	@BeforeEach
	void init() {
		나라의숫자 = new 나라의숫자();
	}

	@Test
	void testCase01() {
		// given
		int n = 10;

		// when
		String result = 나라의숫자.solution(n);

		// then
		String expected = "41";
		assertThat(result).isEqualTo(expected);
	}

}
