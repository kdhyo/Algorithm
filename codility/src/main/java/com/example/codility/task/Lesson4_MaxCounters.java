package com.example.codility.task;

public class Lesson4_MaxCounters {

	public int[] solution(int N, int[] A) {
		int[] result = new int[N];

		int max = 0;
		int maxCounter = 0;
		for (int num : A) {
			if (num == N + 1) {
				maxCounter = max;
				continue;
			}

			if (result[num - 1] < maxCounter) {
				result[num - 1] = maxCounter;
			}
			max = Math.max(max, ++result[num - 1]);
		}

		if (maxCounter > 0) {
			for (int i = 0; i < result.length; i++) {
				if (result[i] < maxCounter) {
					result[i] = maxCounter;
				}
			}
		}

		return result;
	}

}
