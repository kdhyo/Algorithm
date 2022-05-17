package inflearn.dfs;

import java.util.ArrayList;
import java.util.List;

public class 재귀함수 {

	private List<Integer> result = new ArrayList<>();

	public List<Integer> solution(Integer n) {
		dfs(n);
		return result;
	}

	private void dfs(Integer n) {
		if (n == 1) {
			result.add(n);
			return;
		}

		dfs(n - 1);
		result.add(n);
	}

}
