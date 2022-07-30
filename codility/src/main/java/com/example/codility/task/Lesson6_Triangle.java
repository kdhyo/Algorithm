package com.example.codility.task;

import java.util.Arrays;

public class Lesson6_Triangle {

	/**
	 * R + P > Q
	 * Q + R > P
	 * P + Q > R
	 *  sort 시 R이 가장 큰 숫자기 때문에
	 * 	R 이랑 더하면, 조건에 다 부합하다. 결국, P + Q > R 만 확인하면 된다.
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int N = A.length;
		if (N < 3) {
			return 0;
		}

		Arrays.sort(A);

		for (int i = 0; i < N - 2; i++) {
			long P = A[i], Q = A[i + 1], R = A[i + 2];

			if (P + Q > R) {
				return 1;
			}
		}

		return 0;
	}

}
