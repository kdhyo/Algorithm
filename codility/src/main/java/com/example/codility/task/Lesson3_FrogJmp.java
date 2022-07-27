package com.example.codility.task;

public class Lesson3_FrogJmp {

	public int solution(int X, int Y, int D) {
		if (X == Y) {
			return 0;
		}

		return (int) Math.ceil((Y - X) / (double) D);
	}

}
