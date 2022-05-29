package inflearn.dfs;

public class 최대점수구하기 {

	private int limitTime;
	private int count;
	private int[][] score;

	private int maxScore;

	public int solution(int limitTime, int[][] score) {
		this.limitTime = limitTime;
		this.count = score.length;
		this.score = score;

		dfs(0, 0, 0);

		return maxScore;
	}

	private void dfs(int level, int sumScore, int sumTime) {
		if (sumTime > limitTime) {
			return;
		}

		if (sumScore > maxScore) {
			maxScore = sumScore;
		}

		if (level == count) {
			return;
		}

		dfs(level + 1, sumScore + score[level][0], sumTime + score[level][1]);
		dfs(level + 1, sumScore, sumTime);
	}


}
