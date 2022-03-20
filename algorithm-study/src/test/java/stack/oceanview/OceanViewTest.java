package stack.oceanview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class OceanViewTest {

	@Test
	void case1() {
		OceanView oceanView = new OceanView();
		int[] result = oceanView.findOceanViewBuildings(new int[]{4, 2, 3, 1});

		assertThat(result).isEqualTo(new int[]{0, 2, 3});
	}

	@Test
	void case2() {
		OceanView oceanView = new OceanView();
		int[] result = oceanView.findOceanViewBuildings(new int[]{4, 3, 2, 1});

		assertThat(result).isEqualTo(new int[]{0, 1, 2, 3});
	}

	@Test
	void case3() {
		OceanView oceanView = new OceanView();
		int[] result = oceanView.findOceanViewBuildings(new int[]{1, 3, 2, 4});

		assertThat(result).isEqualTo(new int[]{3});
	}

	@Test
	void case4() {
		OceanView oceanView = new OceanView();
		int[] result = oceanView.findOceanViewBuildings(new int[]{2, 2, 2, 2});

		assertThat(result).isEqualTo(new int[]{3});
	}

}