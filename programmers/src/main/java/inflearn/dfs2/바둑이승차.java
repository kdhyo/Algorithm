package inflearn.dfs2;

public class 바둑이승차 {

	private int max;
	private int[] dogs;
	private int count;
	private int result;

	private int solution(int max, int[] dogs) {
		this.max = max;
		this.dogs = dogs;
		this.count = dogs.length;
		this.result = 0;

		dfs(0, 0);

		return result;
	}

	private void dfs(int level, int sum) {
		if (sum > max) {
			return;
		}

		if (sum > result) {
			result = sum;
		}

		if (level == count) {
			return;
		}

		dfs(level + 1, sum + dogs[level]);
		dfs(level + 1, sum);
	}


	public static void main(String[] args) {
		바둑이승차 test = new 바둑이승차();

		int result = test.solution(259, new int[]{81, 58, 42, 33, 61});
		System.out.println("result = " + result);
	}

}
