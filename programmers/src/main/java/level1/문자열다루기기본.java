package level1;

public class 문자열다루기기본 {

	public boolean solution(String s) {
		char[] chars = s.toCharArray();
		for (char aChar : chars) {
			if (!Character.isDigit(aChar)) {
				return false;
			}
		}
		return s.length() == 4 || s.length() == 6;
	}

}
