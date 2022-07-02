package level2.kakao;

public class 괄호변환 {

	public String solution(String p) {
		if (p.isEmpty()) {
			return "";
		}

		if (isCheck(p)) {
			return p;
		}

		return split(p);
	}

	private boolean isCheck(String p) {
		int open = 0;

		if (p.charAt(0) == ')') {
			return false;
		}

		open++;
		for (int i = 1; i < p.length(); i++) {
			open = getOpen(p, i, open);
			if (open < 0) {
				return false;
			}
		}
		return true;
	}

	private String split(String w) {
		StringBuilder u = new StringBuilder();
		StringBuilder v = new StringBuilder();

		if (w.length() == 0) {
			return "";
		}

		int open = 0;
		for (int i = 0; i < w.length(); i++) {
			open = getOpen(w, i, open);

			if (open == 0) {
				u.append(w, 0, i + 1);
				v.append(w.substring(i + 1));

				if (isCheck(u.toString())) {
					u.append(split(v.toString()));
				} else {
					StringBuilder str = new StringBuilder();
					str.append("(");
					str.append(split(v.toString()));
					str.append(")");
					str.append(reverse(u.toString()));
					return str.toString();
				}
				break;
			}
		}
		return u.toString();
	}

	private String reverse(String str) {
		StringBuilder s = new StringBuilder();

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '(') {
				s.append(")");
			} else {
				s.append("(");
			}
		}
		return s.toString();
	}

	private int getOpen(String w, int i, int open) {
		if (w.charAt(i) == '(') {
			open++;
		} else {
			open--;
		}
		return open;
	}

	public static void main(String[] args) {
		괄호변환 test = new 괄호변환();
		String solution = test.solution("()))((()");
	}

}
