package com.example.codility.task;

import java.util.Arrays;

public class Lesson6_MaxProductOfThree {

	public int solution(int[] A) {
		Arrays.sort(A);

		int N = A.length;
		int n = A[N - 1] * A[N - 2] * A[N - 3];
		int m = A[0] * A[1] * A[N - 1];

		return Math.max(n, m);
	}

}
