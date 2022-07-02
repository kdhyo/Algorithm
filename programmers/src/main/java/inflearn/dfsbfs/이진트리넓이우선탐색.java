package inflearn.dfsbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class 이진트리넓이우선탐색 {
	private int n;
	private Deque<Integer> queue;

	public static void main(String[] args) {
		이진트리넓이우선탐색 test = new 이진트리넓이우선탐색();
		test.solution(7);
	}

	private void solution(int n) {
		this.n = n;
		this.queue = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		queue.addLast(1);

		while (!queue.isEmpty()) {
			Integer v = queue.removeFirst();
			sb.append(v).append(" ");

			if (v * 2 > 7) {
				continue;
			}
			queue.addLast(v * 2);
			if (v * 2 + 1 > 7) {
				continue;
			}
			queue.addLast(v * 2 + 1);
		}

		System.out.println("sb = " + sb);
	}

}
