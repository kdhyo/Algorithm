package inflearn.dfs;

public class 바둑이승차 {

	private int limit;
	private int count;
	private int[] dogs;

	private int max = 0;

	public int solution(int limit, int[] dogs) {
		this.limit = limit;
		this.count = dogs.length;
		this.dogs = dogs;

		dfs(0, 0);

		return max;
	}

	private void dfs(int level, int sum) {
		if (sum > limit) {
			return;
		}

		if (sum > max) {
			max = sum;
		}

		if (level == count) {
			return;
		}

		dfs(level + 1, sum + dogs[level]);
		dfs(level + 1, sum);
	}


}
