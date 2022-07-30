package com.example.codility.task;

import java.util.HashSet;

public class Lesson6_Distinct {

	public int solution(int[] A) {
		HashSet<Integer> hashSet = new HashSet<>();

		for (int num : A) {
			hashSet.add(num);
		}

		return hashSet.size();
	}

}
