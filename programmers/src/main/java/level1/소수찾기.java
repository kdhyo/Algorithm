package level1;

public class 소수찾기 {

	public int solution(int n) {
		int answer = 0;
		boolean[] prime = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			prime[i] = true;
		}

		//제곱근 구하기
		int root = (int) Math.sqrt(n);
		for (int i = 2; i <= root; i++) {
			if (prime[i]) {
				for (int j = i; i * j <= n; j++) {
					prime[i * j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				answer++;
			}
		}
		return answer;
	}

}
