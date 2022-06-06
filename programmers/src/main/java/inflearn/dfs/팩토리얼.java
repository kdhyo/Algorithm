
package inflearn.dfs;

public class 팩토리얼 {


	public int solution(int n) {
		return dfs(n);
	}

	private int dfs(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * dfs(num - 1);
		}
	}

}
