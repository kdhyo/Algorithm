package level1;

public class x만큼간격이있는n개의숫자 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		answer[0] = x;
		long nowSum = x;

		for (int i = 1; i < n; i++) {
			nowSum += x;
			answer[i] = nowSum;
		}
		return answer;
	}

	/**
	 * 배열 이전껄 보고 더해주는게 멋있어보였음
	 */
	public static long[] solution2(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		return answer;
	}

}
