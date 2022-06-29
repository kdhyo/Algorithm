package level1;

public class 정수제곱근판별 {

	public long solution(long n) {
		long answer = (long) Math.sqrt(n);

		if (n == (long) Math.pow(answer, 2)) {
			return (long) Math.pow(answer + 1d, 2);
		}

		return -1;
	}

}
