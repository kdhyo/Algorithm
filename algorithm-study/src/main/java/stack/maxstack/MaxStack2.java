package stack.maxstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack2 {

	private Deque<Integer> stack;
	private Deque<Integer> maxStack;

	public MaxStack2() {
		this.stack = new ArrayDeque<>();
		this.maxStack = new ArrayDeque<>();
	}

	public void push(Integer x) {
		stack.addLast(x);
		maxStack.addLast(maxStack.isEmpty() ? x : Math.max(maxStack.peekLast(), x));
	}

	public Integer pop() {
		maxStack.removeLast();
		return stack.removeLast();
	}

	public Integer top() {
		return stack.peekLast();
	}

	public Integer peekMax() {
		return maxStack.peekLast();
	}

	public Integer popMax() {
		Integer max = peekMax();
		Deque<Integer> tmp = new ArrayDeque<>();

		while (stack.peekLast() != max) {
			tmp.addLast(pop());
		}

		pop();
		while (!tmp.isEmpty()) {
			push(tmp.removeFirst());
		}

		return max;
	}

}
