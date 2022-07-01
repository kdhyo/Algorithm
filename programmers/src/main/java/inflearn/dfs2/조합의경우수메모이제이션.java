package inflearn.dfs2;

public class 조합의경우수메모이제이션 {

	int[][] checked;

	public static void main(String[] args) {
		조합의경우수메모이제이션 test = new 조합의경우수메모이제이션();
		test.solution(33, 19);
	}

	private void solution(int n, int r) {
		checked = new int[34][34];
		System.out.println("dfs(n, r) = " + dfs(n, r));
	}

	private int dfs(int n, int r) {
		if (checked[n][r] != 0) {
			return checked[n][r];
		}
		if (n == r || r == 0) {
			return 1;
		}
		checked[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
		return checked[n][r];
	}

}
