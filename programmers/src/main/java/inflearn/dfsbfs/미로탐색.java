package inflearn.dfsbfs;

public class 미로탐색 {

	private int[] dx = {-1, 1, 0, 0};
	private int[] dy = {0, 0, -1, 1};
	private boolean[][] checked;
	private int[][] miro;
	private int result;
	private int size;

	public static void main(String[] args) {
		미로탐색 test = new 미로탐색();
		test.solution(new int[][]{
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{1, 1, 0, 1, 0, 1, 1},
			{1, 1, 0, 0, 0, 0, 1},
			{1, 1, 0, 1, 1, 0, 0},
			{1, 0, 0, 0, 0, 0, 0}
		});
	}

	private void solution(int[][] miro) {
		this.size = miro.length;
		this.checked = new boolean[this.size][this.size];
		this.miro = miro;
		this.result = 0;

		checked[0][0] = true;
		dfs(0, 0);
		System.out.println("result = " + result);
	}

	private void dfs(int x, int y) {
		if (x == this.size && y == this.size) {
			result++;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX < 0 || nextX > this.size || nextY < 0 || nextY > this.size) {
				continue;
			}

			if (miro[nextX][nextY] == 0 && !checked[nextX][nextY]) {
				checked[nextX][nextY] = true;
				dfs(nextX, nextY);
				checked[nextX][nextY] = false;
			}
		}
	}

}
