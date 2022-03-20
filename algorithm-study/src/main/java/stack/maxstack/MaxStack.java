package stack.maxstack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxStack {

	private Deque<Integer> stack;

	public MaxStack() {
		this.stack = new ArrayDeque<>();
	}

	// O(1)
	public void push(Integer x) {
		stack.addLast(x);
	}

	// O(1)
	public Integer pop() {
		return stack.removeLast();
	}

	// O(1)
	public Integer top() {
		return stack.peekLast();
	}

	// O(n)
	public Integer peekMax() {
		return stack.stream()
			.max(Integer::compareTo)
			.orElseThrow();
	}

	// O(n)
	public Integer popMax() {
		Integer max = peekMax();
		ArrayList<Integer> list = new ArrayList<>(stack);
		list.remove(list.lastIndexOf(max));
		stack = new ArrayDeque<>(list);

		return max;
	}

}
