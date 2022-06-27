package level1.kakao;

public class 다트게임 {

	public int solution(String dartResult) {
		int answer = 0;

		StringBuilder temp = new StringBuilder();
		int[] arr = new int[3];
		int idx = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			switch (dartResult.charAt(i)) {
				case '*':
					arr[idx - 1] *= 2;
					if (idx > 1) {
						arr[idx - 2] *= 2;
					}
					break;
				case '#':
					arr[idx - 1] *= -1;
					break;
				case 'S':
					arr[idx] = Integer.parseInt(temp.toString());
					idx++;
					temp = new StringBuilder();
					break;
				case 'D':
					arr[idx] = (int) Math.pow(Integer.parseInt(temp.toString()), 2);
					idx++;
					temp = new StringBuilder();
					break;
				case 'T':
					arr[idx] = (int) Math.pow(Integer.parseInt(temp.toString()), 3);
					idx++;
					temp = new StringBuilder();
					break;
				default:
					temp.append(dartResult.charAt(i));
					break;
			}
		}

		for (int j : arr) {
			answer += j;
		}
		return answer;
	}

}
