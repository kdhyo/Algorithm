package level1;

public class 음양더하기 {

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		int size = absolutes.length;

		for (int i = 0; i < size; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}

		return answer;
	}

}
