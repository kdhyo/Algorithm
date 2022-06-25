package level1.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class 실패율 {

	public int[] solution(int N, int[] stages) {
		int[] arr = new int[N + 2];
		for (int stage : stages) {
			arr[stage]++;
		}

		List<Double> doubles = new ArrayList<>();
		int remainingPlayers = stages.length;
		for (int i = 1; i <= N; i++) {
			if (arr[i] == 0) {
				doubles.add(0d);
				continue;
			}
			double failure = (double) arr[i] / remainingPlayers;
			remainingPlayers -= arr[i];
			doubles.add(failure);
		}

		List<Double> doubles1 = new ArrayList<>(doubles);
		doubles.sort(Collections.reverseOrder());

		Set<Integer> result = new LinkedHashSet<>();
		for (Double aDouble : doubles) {
			for (int i = 0; i < doubles1.size(); i++) {
				if (Objects.equals(doubles1.get(i), aDouble)) {
					result.add(i + 1);
				}
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
