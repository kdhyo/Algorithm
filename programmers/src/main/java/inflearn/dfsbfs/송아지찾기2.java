package inflearn.dfsbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class 송아지찾기2 {

	private int[] jump = new int[]{-1, 1, 5};
	private Deque<Integer> queue;
	private int[] dis;
	private boolean[] checked;
	private int result;

	public static void main(String[] args) {
		송아지찾기2 test = new 송아지찾기2();

		test.solution(8, 3);
		return;
	}

	private void solution(int n, int finish) {
		checked = new boolean[10001];
		dis = new int[10001];
		queue = new ArrayDeque<>();

		// 초기 값셋팅
		checked[n] = true;
		queue.addLast(n);
		result = 0;
		dis[n] = 0; // 0 레벨

		while (!queue.isEmpty()) {
			Integer x = queue.removeLast();
			for (int nx : jump) {
				nx += x;
				if (nx == finish) {
					result = dis[x] + 1;
					break;
				}

				if (nx > 0 && nx <= 10000 && !checked[nx]) {
					checked[nx] = true;
					queue.addLast(nx);
					dis[nx] = dis[x] + 1;
				}
			}
		}
		System.out.println("result = " + result);
	}

}
