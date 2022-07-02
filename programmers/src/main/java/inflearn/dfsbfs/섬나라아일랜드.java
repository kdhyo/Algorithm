package inflearn.dfsbfs;

public class 섬나라아일랜드 {

	// 상, 하, 좌, 우, 좌상대, 우상대, 좌하대, 우하대
	private int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
	private int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
	private int[][] fans;
	private int size;
	private int result;

	public static void main(String[] args) {
		섬나라아일랜드 test = new 섬나라아일랜드();
		test.solution(new int[][]{
			{1, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 0, 1, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 1, 1},
			{1, 1, 0, 1, 1, 0, 0},
			{1, 0, 0, 0, 1, 0, 0},
			{1, 0, 1, 0, 1, 0, 0}
		});
	}

	private void solution(int[][] board) {
		this.fans = board;
		this.size = board.length;
		this.result = 0;

		for (int x = 0; x < this.size; x++) {
			for (int y = 0; y < this.size; y++) {
				if (board[x][y] == 1) {
					result++;
					dfs(x, y);
				}

			}
		}
		System.out.println("result = " + result);
	}

	private void dfs(int x, int y) {
		fans[x][y] = 0;

		for (int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= this.size || ny < 0 || ny >= this.size || fans[nx][ny] == 0) {
				continue;
			}

			dfs(nx, ny);
		}

	}

}
