package com.example.codility.task;

public class Lesson5_GenomicRangeQuery {

	public static int[] solution(String S, int[] P, int[] Q) {
		int len = S.length();
		int[][] arr = new int[len][4];
		int[] result = new int[P.length];

		for (int i = 0; i < len; i++) {
			char c = S.charAt(i);
			if (c == 'A') {
				arr[i][0] = 1;
			} else if (c == 'C') {
				arr[i][1] = 1;
			} else if (c == 'G') {
				arr[i][2] = 1;
			} else if (c == 'T') {
				arr[i][3] = 1;
			}
		}
		// compute prefixes
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] += arr[i - 1][j];
			}
		}

		for (int i = 0; i < P.length; i++) {
			int x = P[i];
			int y = Q[i];

			for (int a = 0; a < 4; a++) {
				int sub = 0;
				if (x - 1 >= 0) {
					sub = arr[x - 1][a];
				}
				if (arr[y][a] - sub > 0) {
					result[i] = a + 1;
					break;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Lesson5_GenomicRangeQuery query = new Lesson5_GenomicRangeQuery();
		int[] cagcctas = query.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});

	}

}
