package inflearn.dfs;

public class 최대점수구하기 {

	private int limit;
	private int count;
	private int[][] score;

	private int maxScore;

	public int solution(int limit, int[][] score) {
		this.limit = limit;
		this.count = score.length;
		this.score = score;

		dfs(0, 0, 0);

		return maxScore;
	}

	private void dfs(int level, int sum, int time) {
		if (time > limit) {
			return;
		}

		if (sum > maxScore) {
			maxScore = sum;
		}

		if (level == count) {
			return;
		}

		dfs(level + 1, sum + score[level][0], time + score[level][1]);
		dfs(level + 1, sum, time);
	}


}
