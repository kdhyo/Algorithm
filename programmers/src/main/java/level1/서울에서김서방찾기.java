package level1;

import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {

	public String solution(String[] seoul) {
		String answer = "김서방은 %d에 있다";
		List<String> list = Arrays.asList(seoul);
		return String.format(answer, list.indexOf("Kim"));
	}

}
