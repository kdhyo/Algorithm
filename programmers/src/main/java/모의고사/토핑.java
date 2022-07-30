package 모의고사;

import java.util.HashSet;

public class 토핑 {

	public int solution(int[] topping) {
		int answer = 0;

		if (topping.length == 1) {
			return 0;
		}

		if (topping.length == 2) {
			return 1;
		}

		int[] checked = new int[topping.length];
		HashSet<Integer> integers = new HashSet<>();
		for (int i = 0; i < topping.length; i++) {
			integers.add(topping[i]);
			checked[i] = integers.size();
		}

		HashSet<Integer> integers1 = new HashSet<>();
		for (int i = topping.length - 1; i > 0; i--) {
			integers1.add(topping[i]);
			if (integers1.size() == checked[i - 1]) {
				answer++;
			}
		}

		return answer;
	}

}
