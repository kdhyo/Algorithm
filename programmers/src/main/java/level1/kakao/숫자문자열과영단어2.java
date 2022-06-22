package level1.kakao;

public class 숫자문자열과영단어2 {

	private static final String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	public int solution(String s) {
		for (int i = 0; i < nums.length; i++) {
			s = s.replaceAll(nums[i], i + "");
		}

		return Integer.parseInt(s);
	}

}
