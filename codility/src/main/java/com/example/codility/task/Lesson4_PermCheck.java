package com.example.codility.task;

import java.util.HashSet;
import java.util.Set;

public class Lesson4_PermCheck {

	public int solution(int[] A) {
		boolean[] checked = new boolean[100_001];

		for (int num : A) {
			if (num > 100_001) {
				return 0;
			}
			checked[num] = true;
		}

		for (int i = 1; i <= A.length + 1; i++) {
			if (!checked[i]) {
				return 0;
			}
		}
		return 1;
	}

	public int solution2(int[] A) {
		Set<Integer> marks = new HashSet<>();

		for (int num : A) {
			if (num > A.length) {
				return 0;
			}

			if (marks.contains(num)) {
				return 0;
			}

			marks.add(num);
		}

		return 1;
	}

}
