package level1.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 로또최고순위와최저순위 {

	private static final int[] ranking = new int[]{6, 6, 5, 4, 3, 2, 1};

	public int[] solution(int[] lottos, int[] winNums) {
		List<Integer> list = Arrays.stream(lottos)
			.boxed().collect(Collectors.toList());

		int count = (int) list.stream()
			.filter(num -> num == 0)
			.count();

		int check = (int) Arrays.stream(winNums)
			.filter(list::contains)
			.count();

		return new int[]{ranking[check + count], ranking[check]};
	}

	/**
	 * map을 활용한 것, for 한 번 돌면서 zero 카운트 한 게
	 * 내 것보다 for 도는 게 적어서 마음에들었음.
	 */
	public int[] solution2(int[] lottos, int[] win_nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		int zeroCount = 0;

		for(int lotto : lottos) {
			if(lotto == 0) {
				zeroCount++;
				continue;
			}
			map.put(lotto, true);
		}


		int sameCount = 0;
		for(int winNum : win_nums) {
			if(map.containsKey(winNum)) sameCount++;
		}

		int maxRank = 7 - (sameCount + zeroCount);
		int minRank = 7 - sameCount;
		if(maxRank > 6) maxRank = 6;
		if(minRank > 6) minRank = 6;

		return new int[] {maxRank, minRank};
	}

}
