package inflearn.dfs2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 조합구하기 {

	private int n;
	private int m;
	private int[] result;

	public static void main(String[] args) {
		조합구하기 test = new 조합구하기();
		test.solution(4, 2);
	}

	private void solution(int n, int m) {
		this.n = n;
		this.m = m;
		this.result = new int[m];

		dfs(0, 1);
	}

	private void dfs(int level, int s) {
		if (level == m) {
			System.out.println("result = " + Arrays.stream(result).boxed().collect(Collectors.toList()));
			return;
		}

		for (int i = s; i <= n; i++) {
			result[level] = i;
			dfs(level + 1, i + 1);
		}
	}

}
