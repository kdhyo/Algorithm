package com.example.codility.yanolga;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class demo {

	public int solution(int[] A) {

		int result = 1;

		Set<Integer> nums = Arrays.stream(A)
			.filter(num -> num >= 1)
			.boxed()
			.collect(Collectors.toSet());

		while (nums.contains(result)) {
			result++;
		}

		return result;
	}

}
