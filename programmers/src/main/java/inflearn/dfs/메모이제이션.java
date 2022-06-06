
package inflearn.dfs;

public class 메모이제이션 {

	private int[][] dy;

	public int solution(int n, int r) {
		dy = new int[n + 1][r + 1];
		return dfs(n, r);
	}

	private int dfs(int n, int r) {
		if (dy[n][r] > 0) {
			return dy[n][r];
		}
		if (r == 0 || n == r) {
			return 1;
		} else {
			dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
			return dy[n][r];
		}
	}

}
