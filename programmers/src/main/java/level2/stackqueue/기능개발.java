package level2.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class 기능개발 {

	public int[] solution(int[] progresses, int[] speeds) {
		Deque<Integer> checked = new ArrayDeque<>();

		int total = 0;
		for (int i = 0; i < progresses.length; i++) {

			int now = 0;
			while (progresses[i] <= 100) {
				progresses[i] += speeds[i];
				now++;
			}
			if (total < now) {
				total = now;
				checked.addLast(1);
			} else {
				if (checked.isEmpty()) {
					checked.addLast(1);
				} else {
					checked.addLast(checked.removeLast() + 1);
				}
			}
		}

		return checked.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		기능개발 test = new 기능개발();

	}

}
