package inflearn.dfs2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 순열구하기 {

	private int m;
	private int[] nums;
	private int[] tmp;
	private boolean[] checked;

	private void solution(int m, int[] nums) {
		this.m = m;
		this.nums = nums;
		this.tmp = new int[m];
		this.checked = new boolean[nums.length];

		dfs(0);
	}

	private void dfs(int level) {
		if (level == m) {
			System.out.println("tmp = " + Arrays.stream(tmp).boxed().collect(Collectors.toList()));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!checked[i]) {
				checked[i] = true;
				tmp[level] = nums[i];
				dfs(level + 1);
				checked[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		순열구하기 test = new 순열구하기();
		test.solution(2, new int[]{3, 6, 9});
	}


}
