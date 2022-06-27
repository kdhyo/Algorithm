package level1;

import java.util.Arrays;

public class 문자열내맘대로정렬 {

	public String[] solution(String[] strings, int n) {
		return Arrays.stream(strings)
			.map(st -> new RandomString(n, st))
			.sorted()
			.map(RandomString::toString)
			.toArray(String[]::new);
	}

	static class RandomString implements Comparable<RandomString> {

		private final int idx;
		private final String string;

		public RandomString(int idx, String string) {
			this.idx = idx;
			this.string = string;
		}

		@Override
		public int compareTo(RandomString o) {
			char a = getCompareChar();
			char b = o.getCompareChar();
			if (a == b) {
				return string.compareTo(o.toString());
			}
			return a > b ? 1 : -1;
		}

		@Override
		public String toString() {
			return string;
		}

		public char getCompareChar() {
			return string.charAt(idx);
		}
	}

}
