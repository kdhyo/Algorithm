package level1.kakao;

public class 비밀지도 {

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);

			if (a.length() < n) {
				StringBuilder sb = new StringBuilder(a);
				while (sb.length() < n) {
					sb.insert(0, "0");
				}
				a = sb.toString();
			}

			if (b.length() < n) {
				StringBuilder sb = new StringBuilder(b);
				while (sb.length() < n) {
					sb.insert(0, "0");
				}
				b = sb.toString();
			}

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				String a1 = String.valueOf(a.charAt(j));
				String b1 = String.valueOf(b.charAt(j));
				if (a1.equals("1") || b1.equals("1")) {
					sb.append("#");
				} else {
					sb.append(" ");
				}
			}
			answer[i] = sb.toString();
		}

		return answer;
	}

	/**
	 * format 으로 0 을 넣어주고, arr1[i] | arr2[i] 진행한 부분이 인상적
	 */
	public String[] solution2(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String temp;

		for (int i = 0; i < n; i++) {
			temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
			temp = temp.substring(temp.length() - n);
			temp = temp.replaceAll("1", "#");
			temp = temp.replaceAll("0", " ");
			answer[i] = temp;
		}

		return answer;
	}

}
