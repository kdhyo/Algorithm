package com.example.codility.task;

import java.util.HashSet;

public class Lesson2_OddOccurrencesInArray {

	public int solution(int[] A) {
		HashSet<Integer> result = new HashSet<>();
		for (int num : A) {
			if (result.contains(num)) {
				result.remove(num);
			} else {
				result.add(num);
			}
		}

		return result.iterator().next();
	}

}
