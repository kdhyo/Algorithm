package inflearn.dfs;

import java.util.List;

public class 합이같은부분집합 {

	private int total;
	private int size;
	private List<Integer> group;
	private String result = "NO";

	public String solution(List<Integer> group) {
		this.total = group.stream().mapToInt(num -> num).sum();
		this.size = group.size();
		this.group = group;

		dfs(0, 0);

		return result;
	}

	private void dfs(int sum, int level) {
		if (this.total / 2 < sum || "YES".equals(result)) {
			return;
		}

		if (level == size) {
			if (total == (this.total - sum)) {
				result = "YES";
			}
			return;
		}

		dfs(sum + group.get(level), level + 1);
		dfs(sum, level + 1);
	}

}
