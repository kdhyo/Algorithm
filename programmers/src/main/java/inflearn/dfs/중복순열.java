
package inflearn.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 중복순열 {

	private int n;
	private int m;
	private int[] tmp;
	private List<String> result = new ArrayList<>();

	public List<String> solution(int n, int m) {
		this.n = n;
		this.m = m;
		this.tmp = new int[m];

		dfs(0);

		return result;
	}

	private void dfs(int level) {
		if (level == m) {
			result.add(Arrays.toString(tmp));
			return;
		}

		for (int i = 1; i <= n; i++) {
			tmp[level] = i;
			dfs(level + 1);
		}
	}

}
