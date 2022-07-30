package 모의고사;

public class 삼총사 {

	private int[] numbers;
	private int answer;

	public int solution(int[] number) {
		this.numbers = number;
		this.answer = 0;

		dfs(0, 0, 0);
		return answer;
	}

	private void dfs(int idx, int sum, int count) {
		if (count == 3) {
			if (sum == 0) {
				this.answer++;
			}
			return;
		}

		if (idx == numbers.length) {
			return;
		}

		dfs(idx + 1, sum + numbers[idx], count + 1);
		dfs(idx + 1, sum, count);
	}

}
