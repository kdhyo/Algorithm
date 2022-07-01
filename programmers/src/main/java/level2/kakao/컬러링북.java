package level2.kakao;

public class 컬러링북 {

	// 변수 접근을 위한 전역 변수
	int numberOfArea;
	int maxSizeOfOneArea;

	// 한 영역의 수를 저장하는 변수
	int temp_cnt;

	// 좌표에서 상,하,좌,우 탐색을 위한 배열
	int[] dx = {-1, 1, 0, 0};
	int[] dy = {0, 0, -1, 1};

	// DFS
	public void dfs(int x, int y, int[][] picture, boolean[][] check) {
		if (check[x][y]) {
			return;
		}

		// 처음 방문 시
		check[x][y] = true;

		// 영역의 수 증가
		temp_cnt++;

		// 한 좌표에서 상, 하, 좌, 우 탐색
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// picture 배열의 범위를 벗어나면 continue
			if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) {
				continue;
			}

			// 현 좌표의 색 == 상, 하, 좌, 우 좌표의 색 && 방문한 적 없는 상, 하, 좌, 우 좌표면
			if (picture[x][y] == picture[nx][ny] && !check[nx][ny]) {
				// 재귀
				dfs(nx, ny, picture, check);
			}
		}
	}

	public int[] solution(int m, int n, int[][] picture) {
		numberOfArea = 0;
		maxSizeOfOneArea = 0;
		temp_cnt = 0;
		int[] answer = new int[2];
		boolean[][] check = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (picture[i][j] != 0 && !check[i][j]) {
					numberOfArea++;
					dfs(i, j, picture, check);
				}

				maxSizeOfOneArea = Math.max(maxSizeOfOneArea, temp_cnt);
				temp_cnt = 0;
			}
		}

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;

		return answer;
	}

}
