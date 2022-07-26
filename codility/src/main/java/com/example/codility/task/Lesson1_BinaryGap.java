package com.example.codility.task;

import java.util.HashSet;
import java.util.Set;

public class Lesson1_BinaryGap {

	public int solution(int n) {
		String binaryStr = Integer.toBinaryString(n);

		Set<Integer> result = new HashSet<>();
		int count = 0;
		for (byte strByte : binaryStr.getBytes()) {
			if (strByte == '0') {
				count++;
			} else {
				result.add(count);
				count = 0;
			}
		}

		return result.stream().mapToInt(Integer::intValue).max().getAsInt();
	}

}
