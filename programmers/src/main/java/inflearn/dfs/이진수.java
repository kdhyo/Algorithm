package inflearn.dfs;

import java.util.ArrayList;
import java.util.List;

public class 이진수 {

	private List<Integer> result = new ArrayList<>();

	public List<Integer> solution(Integer n) {
		dfs(n);
		return result;
	}

	private void dfs(Integer n) {
		if (n == 0) {
			return;
		}

		dfs(Math.floorDiv(n, 2));
		result.add(Math.floorMod(n, 2));
	}

}
