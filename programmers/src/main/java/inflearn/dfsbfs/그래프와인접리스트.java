package inflearn.dfsbfs;

import java.util.ArrayList;
import java.util.List;

public class 그래프와인접리스트 {

	private int n;
	private List<List<Integer>> graph;
	private boolean[] checked;
	private int result;

	public static void main(String[] args) {
		그래프와인접리스트 test = new 그래프와인접리스트();
		test.solution(5, new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 1}, {2, 3}, {2, 5}, {3, 4}, {4, 2}, {4, 5}});
	}

	private void solution(int n, int[][] nums) {
		this.n = n;
		this.result = 0;
		this.graph = new ArrayList<>();
		this.checked = new boolean[n];

		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int[] num : nums) {
			graph.get(num[0] - 1).add(num[1] - 1);
		}

		checked[0] = true;
		dfs(0);
		System.out.println("result = " + result);
	}

	private void dfs(int level) {
		if (level == n - 1) {
			result++;
			return;
		}

		for (Integer num : graph.get(level)) {
			if (!checked[num]) {
				checked[num] = true;
				dfs(num);
				checked[num] = false;
			}
		}
	}

}
