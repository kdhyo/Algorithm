package inflearn.dfsbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class 송아지찾기 {

	private int[] jump = new int[]{-1, 1, 5};
	private Deque<Integer> queue;
	private boolean flag;
	private int result;
	private boolean[] checked;

	public static void main(String[] args) {
		송아지찾기 test = new 송아지찾기();

		test.solution(8, 3);
		return;
	}

	private void solution(int n, int finish) {
		checked = new boolean[10001];
		queue = new ArrayDeque<>();
		flag = true;
		result = 0;

		checked[n] = true;
		queue.offer(n);
		while (flag) {
			result++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				if (!flag) {
					break;
				}

				Integer num = queue.removeFirst();
				for (int j = 0; j < 3; j++) {
					int i1 = jump[j] + num;
					if (i1 == finish) {
						flag = false;
						break;
					} else {
						if (!checked[i1]) {
							queue.addLast(i1);
							checked[i1] = true;
						}
					}
				}
			}
		}

		System.out.println("result = " + result);
	}

}
