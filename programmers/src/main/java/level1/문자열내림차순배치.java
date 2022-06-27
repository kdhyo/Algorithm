package level1;

import java.util.Arrays;

public class 문자열내림차순배치 {

	public String solution(String s) {
		return toStringSorted(s);
	}

	private String toStringSorted(String st) {
		char[] toCharArray = st.toCharArray();
		Arrays.sort(toCharArray);
		StringBuilder sb = new StringBuilder(String.valueOf(toCharArray));
		sb.reverse();
		return sb.toString();
	}

}
