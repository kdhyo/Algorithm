package com.example.codility.task;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Lesson3_PermMissingElem {

	public int solution(int[] A) {
		int max = A.length + 1;
		int result = 1;

		Set<Integer> collect = Arrays.stream(A)
			.boxed()
			.collect(Collectors.toSet());

		for (int i = 1; i <= max; i++) {
			if (!collect.contains(i)) {
				result = i;
				break;
			}
		}
		return result;
	}

	/**
	 * 중첩 for를 쓰지 않고...
	 * @param A
	 * @return
	 */
	public int solution2(int[] A) {
		boolean[] checked = new boolean[A.length + 2];

		for (int i = 0; i < A.length; i++) {
			checked[A[i]] = true;
		}

		for (int i = 0; i < checked.length; i++) {
			if (!checked[i]) {
				return i;
			}
		}
		return -1;
	}

}
