package inflearn.dfsbfs;

public class 그래프와인접행렬 {

	private int n;
	private int[][] graph;
	private boolean[] checked;
	private int result;

	public static void main(String[] args) {
		그래프와인접행렬 test = new 그래프와인접행렬();
		test.solution(5, new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 1}, {2, 3}, {2, 5}, {3, 4}, {4, 2}, {4, 5}});
	}

	private void solution(int n, int[][] nums) {
		this.n = n;
		this.result = 0;
		this.graph = new int[n][n];
		this.checked = new boolean[n];

		for (int[] num : nums) {
			graph[num[0] - 1][num[1] - 1] = 1;
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

		for (int i = 0; i < n; i++) {
			if (!checked[i] && graph[level][i] == 1) {
				checked[i] = true;
				dfs(i);
				checked[i] = false;
			}
		}
	}

}
