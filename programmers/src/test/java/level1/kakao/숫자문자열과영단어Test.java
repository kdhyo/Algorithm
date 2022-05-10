package level1.kakao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 숫자문자열과영단어Test {

	숫자문자열과영단어 숫자문자열과영단어;

	@BeforeEach
	void init() {
		숫자문자열과영단어 = new 숫자문자열과영단어();
	}

	@Test
	void testCase01() {
		// given
		String s = "one4seveneight";

		// when
		int result = 숫자문자열과영단어.solution(s);

		// then
		int expected = 1478;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase02() {
		// given
		String s = "23four5six7";

		// when
		int result = 숫자문자열과영단어.solution(s);

		// then
		int expected = 234567;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase03() {
		// given
		String s = "2three45sixseven";

		// when
		int result = 숫자문자열과영단어.solution(s);

		// then
		int expected = 234567;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase04() {
		// given
		String s = "123";

		// when
		int result = 숫자문자열과영단어.solution(s);

		// then
		int expected = 123;
		assertThat(result).isEqualTo(expected);
	}

}
