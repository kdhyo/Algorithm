package level2.kakao2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class 신고결과받기 {

	/***
	 * LinkedHashMap 으로 결과 값 정렬.
	 */
	public int[] solution(String[] idList, String[] report, int k) {
		List<Integer> result = new ArrayList<>();
		Map<String, Set<String>> idListResult = new LinkedHashMap<>();
		Map<String, Set<String>> reportResult = new HashMap<>();

		for (String id : idList) {
			reportResult.put(id, new HashSet<>());
			idListResult.put(id, new HashSet<>());
		}

		for (String id : report) {
			String[] ids = id.split(" ");

			reportResult.get(ids[1]).add(ids[0]);
			idListResult.get(ids[0]).add(ids[1]);
		}

		idListResult.forEach((key, value) -> {
			int count = (int) value.stream()
				.filter(id -> reportResult.get(id).size() >= k)
				.count();
			result.add(count);
		});

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	/***
	 * distinct 를 통해 중복 제거로 연속 신고를 없앤 게 인상깊음.
	 * 내 코드 경우 LinkedHashMap 을 사용해 결과 값을 도출했지만,
	 * 여기서는 idList 를 바로 stream map 으로 돌려서 했기 때문에 정렬이 그대로 됨.
	 */
	public int[] solution2(String[] idList, String[] report, int k) {
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		HashMap<String, Integer> count = new HashMap<>();
		for (String s : list) {
			String target = s.split(" ")[1];
			count.put(target, count.getOrDefault(target, 0) + 1);
		}

		return Arrays.stream(idList).map(user -> {
			List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
			return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
		}).mapToInt(Long::intValue).toArray();
	}

}
