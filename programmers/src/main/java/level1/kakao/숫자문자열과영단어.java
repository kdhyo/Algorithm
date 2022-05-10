package level1.kakao;

public class 숫자문자열과영단어 {

	private static final String[] numbers = {"zero", "one", "two", "three",
		"four", "five", "six", "seven",
		"eight", "nine"};

	public int solution(String s) {
		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(numbers[i], Integer.toString(i));
		}
		return Integer.parseInt(s);
	}

}
