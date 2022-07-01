package inflearn.dfs2;

public class 동전교환 {

	private int[] coins;
	private int max;
	private int result = Integer.MAX_VALUE;
	private int count = 0;

	private void solution(int[] coins, int max) {
		this.coins = coins;
		this.max = max;

		dfs(0, 0);
		System.out.println("result = " + result);
		System.out.println("count = " + count);
	}

	private void dfs(int level, int price) {
		if (price > max || level >= result) {
			return;
		}

		if (price == max) {
			result = Math.min(result, level);
			return;
		}

		for (int coin : coins) {
			count++;
			dfs(level + 1, price + coin);
		}
	}

	public static void main(String[] args) {
		동전교환 test = new 동전교환();
		test.solution(new int[]{1, 2, 5}, 15);
	}

}
