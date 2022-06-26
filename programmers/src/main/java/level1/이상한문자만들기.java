package level1;

public class 이상한문자만들기 {

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		int cnt = 0;
		String[] array = s.split("");

		for(String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer.append(cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
		}
		return answer.toString();
	}

}
