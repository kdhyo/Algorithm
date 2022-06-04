
package inflearn.dfs;

import java.util.List;

public class 동전교환 {

	private List<Integer> coins;
	private int limitPrice;
	private int size;
	private int result = Integer.MAX_VALUE;

	public int solution(List<Integer> coins, int price) {
		this.coins = coins;
		this.limitPrice = price;
		this.size = coins.size();

		dfs(0, 0);

		return result;
	}

	private void dfs(int level, int price) {
		if (price > limitPrice) {
			return;
		}

		if (level >= result) {
			return;
		}

		if (price == limitPrice) {
			result = Math.min(result, level);
			return;
		}

		for (int i = 0; i < size; i++) {
			dfs(level + 1, price + coins.get(i));
		}
	}

}
