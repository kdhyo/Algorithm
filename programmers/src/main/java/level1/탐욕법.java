package level1;

import java.util.Arrays;

public class 탐욕법 {

	public int solution(int n, int[] lost, int[] reserve) {
		int count = n;
		int[] arr = new int[31];
		Arrays.fill(arr, 0);
		for (int i : reserve) {
			arr[i]++;
		}
		for (int i : lost) {
			arr[i]--;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == -1) {
				if (arr[i - 1] == 1) {
					arr[i - 1]--;
				} else if (arr[i + 1] == 1) {
					arr[i + 1]--;
				} else {
					count--;
				}
			}
		}
		return count;
	}

}
