package level1;

public class 시저번호 {

	public String solution(String str, int move) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append(" ");
				continue;
			}
			char tmp = str.charAt(i);
			int asc;
			if (Character.isUpperCase(tmp)) {
				asc = tmp + move;
				if (asc > 90) {
					asc = 64 + (asc - 90);
				}
			} else {
				asc = tmp + move;
				if (asc > 122) {
					asc = 96 + (asc - 122);
				}
			}
			sb.append(Character.toString((char) asc));
		}
		return sb.toString();
	}

}
