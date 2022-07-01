package inflearn.dfs2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중복순열구하기 {

	private int n;
	private int m;
	private int[] tmp;
	private int count;

	private void solution(int n, int m) {
		this.n = n;
		this.m = m;
		tmp = new int[m];
		this.count = 0;

		dfs(0);
		System.out.println(count);
	}

	private void dfs(int level) {
		if (level == m) {
			count++;
			System.out.println(Arrays.stream(tmp).boxed().collect(Collectors.toList()));
			return;
		}

		for (int i = 1; i <= n; i++) {
			tmp[level] = i;
			dfs(level + 1);
		}
	}

	public static void main(String[] args) {
		중복순열구하기 test = new 중복순열구하기();
		test.solution(3, 2);
	}

}
