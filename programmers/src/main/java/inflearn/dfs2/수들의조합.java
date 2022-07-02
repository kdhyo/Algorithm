package inflearn.dfs2;

public class 수들의조합 {

	private int k;
	private int m;
	private int n;
	private int[] nums;
	private int count;

	public static void main(String[] args) {
		수들의조합 test = new 수들의조합();
		int result = test.solution(3, 6, new int[]{2, 4, 5, 8, 12});
		System.out.println("result = " + result);
	}

	private int solution(int k, int m, int[] nums) {
		this.k = k;
		this.n = nums.length;
		this.m = m;
		this.nums = nums;
		this.count = 0;

		dfs(0, 0, 0);
		return count;
	}

	private void dfs(int level, int sum, int j) {
		if (level == k) {
			if (sum % m == 0) {
				System.out.println("sum = " + sum);
				count++;
			}
			return;
		}

		for (int i = j; i < n; i++) {
			dfs(level + 1, sum + nums[i], i + 1);
		}
	}

}
