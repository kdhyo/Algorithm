package inflearn.dfs2;

public class 이진트리 {

	public void solution(int n) {
		dfs(n);
	}

	private void dfs(int n) {
		if (n >= 8) {
			return;
		}

//		System.out.println("n = " + n); // 전위순회
		dfs(n * 2);
		System.out.println("n = " + n); // 중위순회
		dfs(n * 2 + 1);
//		System.out.println("n = " + n); // 후위순회
	}

	public static void main(String[] args) {
		이진트리 test = new 이진트리();
		test.solution(1);
	}

}
