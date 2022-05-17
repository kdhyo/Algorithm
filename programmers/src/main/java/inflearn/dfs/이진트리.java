package inflearn.dfs;

public class 이진트리 {

	public static void main(String[] args) {
		solution(1);
	}

	public static void solution(int v) {
		dfs(v);
	}

	private static void dfs(int v) {
		if (v > 7) {
			return;
		} else {
//			System.out.println(v); // 전위순회
			dfs(v * 2);
//			System.out.println(v); // 중위순회
			dfs(v * 2 + 1);
			System.out.println(v); // 후위순회
		}
	}

}
