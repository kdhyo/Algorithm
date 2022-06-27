package level1.monthlycodechallenge;

public class 나머지1이되는수 {

	public int solution(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				return i;
			}
		}
		throw new IllegalArgumentException("잘못된 인수입니다.");
	}

}
