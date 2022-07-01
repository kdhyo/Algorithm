package inflearn.dfs2;

import java.util.Arrays;

public class 합이같은부분집합 {

	private int total;
	private int count;
	private int[] nums;
	private boolean result = false;

	private String solution(int[] nums) {
		this.nums = nums;
		count = nums.length;
		total = Arrays.stream(nums).sum();

		dfs(0, 0);

		return result ? "YES" : "NO";
	}

	private void dfs(int level, int sum) {
		if (result || total / 2 < sum) {
			return;
		}
		if (level == count) {
			int target = total - sum;
			if (target == sum) {
				result = true;
			}
			return;
		}

		dfs(level + 1, sum + nums[level]);
		dfs(level + 1, sum);
	}


	public static void main(String[] args) {
		합이같은부분집합 test = new 합이같은부분집합();
		int[] nums = new int[]{1, 3, 5, 6, 7, 10};
		String solution = test.solution(nums);
		System.out.println("solution = " + solution);
	}



}
