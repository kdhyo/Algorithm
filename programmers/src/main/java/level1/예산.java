package level1;

import java.util.Arrays;

public class 예산 {

	public int solution(int[] d, int budget) {
		Arrays.sort(d);
		int count = 0;
		int sum = 0;
		for (int num : d) {
			sum += num;
			if (sum > budget) {
				break;
			}
			count++;
		}

		return count;
	}

	/**
	 * 인수를 활용하는 것도 좋은 방법!
	 */
	public int solution2(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) break;
			answer++;
		}
		return answer;
	}


}
