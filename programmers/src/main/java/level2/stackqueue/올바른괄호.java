package level2.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class 올바른괄호 {

	boolean solution(String s) {
		Deque<Character> characters = new ArrayDeque<>();
		int length = s.length();

		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '(') {
				characters.push('(');
			} else {
				if (characters.isEmpty()) {
					return false;
				}
				characters.pop();
			}
		}

		return characters.isEmpty();
	}

}
