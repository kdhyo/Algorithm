package level1.kakao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 신고결과받기Test {

	신고결과받기 신고결과받기;

	@BeforeEach
	void init() {
		신고결과받기 = new 신고결과받기();
	}

	@Test
	void testCase01() {
		// given
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;

		// when
		int[] result = 신고결과받기.solution(id_list, report, k);

		// then
		int[] expected = {2, 1, 1, 0};
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testCase02() {
		// given
		String[] id_list = {"con", "ryan"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 3;

		// when
		int[] result = 신고결과받기.solution(id_list, report, k);

		// then
		int[] expected = {0, 0};
		assertThat(result).isEqualTo(expected);
	}

}
