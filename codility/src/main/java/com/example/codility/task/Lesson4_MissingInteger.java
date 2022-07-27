package com.example.codility.task;

public class Lesson4_MissingInteger {

	public int solution(int[] A) {
		boolean[] marks = new boolean[A.length + 1];

		for (int num : A) {
			if (num < 1 || num >= marks.length) {
				continue;
			}
			marks[num] = true;
		}

		for (int i = 1; i < marks.length; i++) {
			if (!marks[i]) {
				return i;
			}
		}

		return marks.length;
	}

}
