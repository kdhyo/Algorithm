package classdesign;

public class SecretMap {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		int size = arr1.length;
		String formatter = "%0" + n + "d";
		String[] answer = new String[size];

		for (int i = 0; i < size; i++) {
			Integer toBinaryString = Integer.parseInt(Integer.toBinaryString(arr1[i]));
			Integer toBinaryString1 = Integer.parseInt(Integer.toBinaryString(arr2[i]));
			String one = String.format(formatter, toBinaryString);
			String two = String.format(formatter, toBinaryString1);

			StringBuilder stringBuilder = new StringBuilder();
			for (int j = 0; j < n; j++) {
				String a = String.valueOf(one.charAt(j));
				String b = String.valueOf(two.charAt(j));

				if (a.equals("0") && b.equals("0")) {
					stringBuilder.append(" ");
				} else {
					stringBuilder.append("#");
				}
			}
			answer[i] = stringBuilder.toString();
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] solution = solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
		System.out.println("solution = " + solution);
	}

}
