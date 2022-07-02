package level2.basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class 괄호회전하기 {

	private int size;
	private int result;
	private List<Character> open = Arrays.asList('[', '{', '(');
	private List<Character> close = Arrays.asList(']', '}', ')');

	public int solution(String s) {
		if (s.length() % 2 != 0) {
			return 0;
		}
		this.size = s.length();
		this.result = 0;
		Deque<Character> queue = new ArrayDeque<>();
		for (char c : s.toCharArray()) {
			queue.addLast(c);
		}

		for (int i = 0; i < size; i++) {
			if (isCheck(queue)) {
				result++;
			}
			queue.addLast(queue.removeFirst());
		}

		return result;
	}

	private boolean isCheck(Deque<Character> queue) {
		List<Character> list = new ArrayList<>(queue);
		Deque<Integer> checked = new ArrayDeque<>();

		for (Character character : list) {
			if (open.contains(character)) {
				checked.addLast(open.indexOf(character));
			} else {
				Integer last = checked.pollLast();
				if (last == null || last != close.indexOf(character)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		괄호회전하기 test = new 괄호회전하기();
		int solution = test.solution("[](){}");
	}

}
