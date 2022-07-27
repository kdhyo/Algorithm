package com.example.codility.task;

public class Lesson5_CountDiv {

	public int solution(int A, int B, int K) {
		int div = B / K - A / K;
		return A % K == 0 ? div + 1 : div;
	}

}
