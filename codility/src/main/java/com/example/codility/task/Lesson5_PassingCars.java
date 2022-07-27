package com.example.codility.task;

public class Lesson5_PassingCars {

	// 비어 있지 않은 배열
	// A의 값은 0 or 1
	// 0은 동쪽 / 1은 서쪽
	//
	public int solution(int[] A) {
		int result = 0;
		int sum = 0;

		for (int num : A) {
			if (num == 0) {
				sum++;
			} else {
				result += sum;
			}

			if (result > 1_000_000_000) {
				return -1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Lesson5_PassingCars cars = new Lesson5_PassingCars();
		int solution = cars.solution(new int[]{0, 1, 0, 1, 1});
		System.out.println("solution = " + solution);
	}

}
