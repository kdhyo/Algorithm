package level2.dfsbfs;

public class 타겟넘버 {

	private int[] numbers;
	private int target;
	private int count;

	public int solution(int[] numbers, int target) {
		this.numbers = numbers;
		this.target = target;
		this.count = 0;

		dfs(0, 0, 0);

		return count;
	}

	private void dfs(int level, int sum, int j) {
		if (level == numbers.length) {
			if (sum == target) {
				System.out.println("sum = " + sum);
				count++;
			}
			return;
		}

		dfs(level + 1, sum + numbers[j], j + 1);
		dfs(level + 1, sum - numbers[j], j + 1);
	}

	public static void main(String[] args) {
		타겟넘버 test = new 타겟넘버();
		test.solution(new int[]{1, 1, 1, 1, 1}, 3);
	}

}
