package level1.monthlycodechallenge;

public class 최소직사각형 {

	public int solution(int[][] sizes) {
		int w = 0;
		int h = 0;

		for (int i = 0; i < sizes.length; i++) {
			int a = sizes[i][0];
			int b = sizes[i][1];
			if (a < b) {
				sizes[i][0] = b;
				sizes[i][1] = a;
			}
			w = Math.max(w, sizes[i][0]);
			h = Math.max(h, sizes[i][1]);
		}
		return w * h;
	}

}
