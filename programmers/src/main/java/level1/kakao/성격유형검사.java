package level1.kakao;

import java.util.HashMap;
import java.util.Map;

/**
 * 1번 지표	라이언형(R), 튜브형(T)
 * 2번 지표	콘형(C), 프로도형(F)
 * 3번 지표	제이지형(J), 무지형(M)
 * 4번 지표	어피치형(A), 네오형(N)
 */
public class 성격유형검사 {

	private static final String[] TYPES = {"RT", "CF", "JM", "AN"};
	private static final int[] SCORES = {3, 2, 1, 0, 1, 2, 3};
	private static final int IDX = 3;

	public String solution(String[] survey, int[] choices) {
		StringBuilder answer = new StringBuilder();
		Map<String, Integer> objects = new HashMap<>();

		int length = survey.length;
		for (int i = 0; i < length; i++) {
			String[] split = survey[i].split("");
			int choiceIdx = choices[i] - 1;

			if (choiceIdx > IDX) {
				objects.put(split[1], objects.getOrDefault(split[1], 0) + SCORES[choiceIdx]);
			} else if (choiceIdx < IDX) {
				objects.put(split[0], objects.getOrDefault(split[0], 0) + SCORES[choiceIdx]);
			}
		}

		for (String type : TYPES) {
			String[] split = type.split("");
			Integer first = objects.getOrDefault(split[0], 0);
			Integer second = objects.getOrDefault(split[1], 0);

			answer.append(first >= second ? split[0] : split[1]);
		}

		return answer.toString();
	}

}
