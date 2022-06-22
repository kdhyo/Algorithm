package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class k번째수 {

	List<Integer> collect;

	public int[] solution(int[] array, int[][] commands) {
		List<Integer> answer = new ArrayList<>();
		collect = Arrays.stream(array)
			.boxed()
			.collect(Collectors.toList());

		for (int[] command : commands) {
			SubList subList = new SubList(command);
			answer.add(subList.getSubListK());
		}
		return answer.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}

	class SubList {

		int i;
		int j;
		int k;

		SubList(int[] command) {
			i = command[0] - 1;
			j = command[1];
			k = command[2] - 1;
		}

		public Integer getSubListK() {
			List<Integer> subList = new ArrayList<>(collect.subList(i, j));
			Collections.sort(subList);

			return subList.get(k);
		}
	}

	/**
	 * 배열로도 자를 수 있는 메서드가 있는지 몰랐음. copyOfRange 확인!
	 */
	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}

}
