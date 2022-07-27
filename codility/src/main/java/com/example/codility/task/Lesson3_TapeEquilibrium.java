package com.example.codility.task;

public class Lesson3_TapeEquilibrium {

	public int solution(int[] A) {
		int[] summery = new int[A.length];
		int result = Integer.MAX_VALUE;

		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			summery[i] = sum;
		}

		int lastIdx = summery.length - 1;
		for (int i = 0; i < lastIdx; i++) {
			int num = sum - summery[i];
			result = Math.min(result, Math.abs(summery[i] - num));
		}

		return result;
	}

}
