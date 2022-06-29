package level1;

import java.util.Arrays;

public class 자릿수더하기 {

	public int solution(int n) {
		String numStr = Integer.toString(n);
		String[] split = numStr.split("");
		return Arrays.stream(split)
			.mapToInt(Integer::valueOf)
			.sum();
	}

	/**
	 * 형변환 안할수있을 땐 하지말자.
	 */
	public int solution2(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}

}
