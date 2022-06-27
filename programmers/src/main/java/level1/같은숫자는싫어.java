package level1;

import java.util.ArrayDeque;
import java.util.Deque;

public class 같은숫자는싫어 {

	public int[] solution(int[] arr) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.addLast(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (stack.peekLast() != arr[i]) {
				stack.addLast(arr[i]);
			}
		}
		return stack.stream().mapToInt(Integer::intValue).toArray();
	}

}
