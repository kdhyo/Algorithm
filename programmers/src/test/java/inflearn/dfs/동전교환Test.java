package inflearn.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class 동전교환Test {

	동전교환 동전교환;

	@BeforeEach
	void init() {
		동전교환 = new 동전교환();
	}

	@Test
	void testCase01() {
		// given
		List<Integer> coins = List.of(1, 2, 5);
		int price = 15;

		// when
		int solution = 동전교환.solution(coins, price);

		// then
		assertThat(solution).isEqualTo(3);
	}

}
