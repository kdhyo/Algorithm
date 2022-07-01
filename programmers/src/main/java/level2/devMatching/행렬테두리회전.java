package level2.devMatching;

public class 행렬테두리회전 {

	public int[] solution(int rows, int columns, int[][] queries) {
		int[][] arr = generateArr(rows, columns);

		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int x1 = queries[i][0] - 1;
			int y1 = queries[i][1] - 1;
			int x2 = queries[i][2] - 1;
			int y2 = queries[i][3] - 1;

			int tmp = arr[x1][y1];
			int min = tmp;

			for (int x = x1 + 1; x <= x2; x++) {
				min = Math.min(min, arr[x][y1]);
				arr[x - 1][y1] = arr[x][y1];
			}

			for (int y = y1 + 1; y <= y2; y++) {
				min = Math.min(min, arr[x2][y]);
				arr[x2][y - 1] = arr[x2][y];
			}

			for (int x = x2 - 1; x >= x1; x--) {
				min = Math.min(min, arr[x][y2]);
				arr[x + 1][y2] = arr[x][y2];
			}

			for (int y = y2 - 1; y >= y1; y--) {
				min = Math.min(min, arr[x1][y]);
				arr[x1][y + 1] = arr[x1][y];
			}
			arr[x1][y1+1] = tmp;
			answer[i] = min;
		}

		return answer;
	}

	private int[][] generateArr(int rows, int columns) {
		int[][] arr = new int[rows][columns];

		int count = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = count++;
			}
		}
		return arr;
	}

}
