package com.example.codility.task;

public class Lesson2_CycleRotation {

	public int[] solution(int[] A, int K) {
		final int A_SIZE = A.length;
		if (A_SIZE == 0) {
			return A;
		}

		K = K % A_SIZE == 0 ? K : K % A_SIZE;
		if (A_SIZE == K || A_SIZE < 2) {
			return A;
		}

		int nextNum = 0;
		int currentNum = 0;
		for (int cycle = 0; cycle < K; cycle++) {
			currentNum = A[0];
			nextNum = A[1];

			for (int idx = 0; idx < A_SIZE; idx++) {
				if (A_SIZE - 1 == idx) {
					A[0] = nextNum;
				} else {
					nextNum = A[idx + 1];
					A[idx + 1] = currentNum;
					currentNum = nextNum;
				}
			}
		}

		return A;
	}

}
