package level2.basic;

public class JadenCase {

	public String solution(String s) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		boolean flag = true;
		for (char a : chars) {
			if (a == ' ') {
				flag = true;
				sb.append(' ');
			} else if (flag) {
				flag = false;
				sb.append(String.valueOf(a).toUpperCase());
			} else {
				sb.append(String.valueOf(a).toLowerCase());
			}
		}
		return sb.toString();
	}

	public String solution2(String s) {
		String[] split = s.toLowerCase().split("");
		StringBuilder sb = new StringBuilder();

		boolean flag = true;
		for (String str : split) {
			sb.append(flag ? str.toUpperCase() : str);
			flag = str.equals(" ");
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println("3".toLowerCase());
		System.out.println("3".toUpperCase());
//		JadenCase jadenCase = new JadenCase();
//		String solution = jadenCase.solution("3people unFollowed me");
	}

}
