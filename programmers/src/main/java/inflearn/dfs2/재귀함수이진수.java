package inflearn.dfs2;

import java.util.ArrayList;
import java.util.List;

public class 재귀함수이진수 {

	List<Integer> result = new ArrayList<>();

	public List<Integer> solution(Integer n) {
		dfs(n);
		return result;
	}

	private void dfs(Integer n) {
		if (n == 0) {
			return;
		}

		dfs(n / 2);
		result.add(n % 2);
	}

	public static void main(String[] args) {
		재귀함수이진수 test = new 재귀함수이진수();
		List<Integer> solution = test.solution(11);
		System.out.println("solution = " + solution);
	}

}
