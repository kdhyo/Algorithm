package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 완주하지못한선수 {

	public String solution(String[] participant, String[] completion) {
		List<String> participantList = new ArrayList<>(Arrays.asList(participant));
		List<String> completionList = new ArrayList<>(Arrays.asList(completion));

		Collections.sort(participantList);
		Collections.sort(completionList);

		int size = participantList.size() - 1;
		for (int i = 0; i < size; i++) {
			if (!participantList.get(i).equals(completionList.get(i))) {
				return participantList.get(i);
			}
		}

		return participantList.get(size);
	}

	/**
	 * 맵 그룹핑한게 인상적
	 */
	public String solution2(String[] participant, String[] completion) {

		Map<String, Long> participantMap = Arrays.asList(participant).stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (String name : completion) {

			Long value = participantMap.get(name) - 1L;

			if (value == 0L) {
				participantMap.remove(name);
			} else {
				participantMap.put(name, value);
			}
		}

		return participantMap.keySet().iterator().next();
	}

}
