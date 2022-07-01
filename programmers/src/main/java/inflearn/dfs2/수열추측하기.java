package inflearn.dfs2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 수열추측하기 {

	private int[][] dy;
	private boolean[] checked;
	private int[] p;
	private int[] b;
	private int n;
	private int f;
	private int[] result;
	private boolean flag;

	public static void main(String[] args) {
		수열추측하기 test = new 수열추측하기();
		test.solution(4, 16);
	}

	private void solution(int n, int f) {
		this.n = n;
		this.f = f;
		dy = new int[11][11];
		checked = new boolean[n + 1];
		p = new int[n];
		b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = combi(n - 1, i);
		}
		System.out.println("b = " + Arrays.stream(b).boxed().collect(Collectors.toList()));
		dfs(0, 0);
		System.out.println("result.st = " + Arrays.stream(result).boxed().collect(Collectors.toList()));
	}

	private void dfs(int level, int sum) {
		if (flag) {
			return;
		}
		if (level == n && sum == f) {
			result = Arrays.stream(p).toArray();
			flag = true;
		}
		for (int i = 1; i <= n; i++) {
			if (!checked[i]) {
				checked[i] = true;
				p[level] = i;
				dfs(level + 1, sum + (b[level] * p[level]));
				checked[i] = false;
			}
		}

	}

	private int combi(int n, int r) {
		if (dy[n][r] != 0) {
			return dy[n][r];
		}
		if (n == r || r == 0) {
			return 1;
		}
		dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
		return dy[n][r];
	}

}
