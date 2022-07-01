package inflearn.dfs2;

public class 부분집합구하기 {

	private int max;
	private boolean[] checked;

	private void solution(int n) {
		max = n;
		checked = new boolean[n + 1];

		dfs(1);
	}

	private void dfs(int i) {
		if (i == max + 1) {
			for (int j = 1; j <= max; j++) {
				if (checked[j]) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			return;
		}

		checked[i] = true;
		dfs(i + 1);
		checked[i] = false;
		dfs(i + 1);
	}

	public static void main(String[] args) {
		부분집합구하기 test = new 부분집합구하기();
		int n = 3;
		test.solution(n);
	}

}
