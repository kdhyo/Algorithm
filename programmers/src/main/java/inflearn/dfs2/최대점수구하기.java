package inflearn.dfs2;

public class 최대점수구하기 {

	private int m;
	private int[][] question;
	private int count;
	private int result;

	private int solution(int m, int[][] question) {
		this.m = m;
		this.question = question;
		this.count = question.length;
		this.result = 0;

		dfs(0, 0, 0);

		return result;
	}

	private void dfs(int level, int score, int time) {
		if (time > m) {
			return;
		}

		if (level == count) {
			result = Math.max(result, score);
			return;
		}

		dfs(level + 1, score + question[level][0], time + question[level][1]);
		dfs(level + 1, score, time);
	}

	// 제한시간 M 안에 최대 점수를 얻어라.
	public static void main(String[] args) {
		최대점수구하기 test = new 최대점수구하기();

		int solution = test.solution(20, new int[][]{{10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}});
		System.out.println("solution = " + solution);
	}

}
