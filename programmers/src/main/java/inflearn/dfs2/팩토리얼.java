package inflearn.dfs2;

public class 팩토리얼 {

	public static void main(String[] args) {
		팩토리얼 test = new 팩토리얼();
		int solution = test.solution(5);
		System.out.println("solution = " + solution);
	}

	private int solution(int n) {
		return dfs(n);
	}

	private int dfs(int n) {
		if (n == 1) {
			return 1;
		}

		return n * dfs(n - 1);
	}

}
