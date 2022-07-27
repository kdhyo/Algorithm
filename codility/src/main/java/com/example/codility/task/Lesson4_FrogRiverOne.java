package com.example.codility.task;

import java.util.HashSet;
import java.util.Set;

public class Lesson4_FrogRiverOne {

	public int solution(int X, int[] A) {
		Set<Integer> marks = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				marks.add(A[i]);

				if (marks.size() == X) {
					return i;
				}
			}
		}

		return -1;
	}

}
