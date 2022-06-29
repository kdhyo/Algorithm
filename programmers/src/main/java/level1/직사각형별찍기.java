package level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 직사각형별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result = solution(a, b);
		System.out.println(result);
	}

	public static String solution(int n, int m) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append("*".repeat(n));
			if (i != m - 1) sb.append("\n");
		}

		return sb.toString();
	}

	/**
	 * 출력이기 때문에 한번만 만들어서 반복출력하면됨.
	 */
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		IntStream.range(0, a).forEach(s -> sb.append("*"));
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
	}

}
