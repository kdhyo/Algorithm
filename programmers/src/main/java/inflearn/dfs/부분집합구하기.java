package inflearn.dfs;

import java.util.ArrayList;
import java.util.List;

public class 부분집합구하기 {

	private int n;
	private boolean[] checked;
	private List<String> result = new ArrayList<>();

	public List<String> solution(int n) {
		this.n = n;
		this.checked = new boolean[n + 1];

		dfs(1);
		return result;
	}

	private void dfs(int idx) {
		if (idx == n + 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < checked.length; i++) {
				if (checked[i]) {
					sb.append(i).append(" ");
				}
			}
			if (sb.length() > 0) {
				result.add(sb.toString().trim());
			}
			return;
		}

		checked[idx] = true;
		dfs(idx + 1);
		checked[idx] = false;
		dfs(idx + 1);
	}

}
