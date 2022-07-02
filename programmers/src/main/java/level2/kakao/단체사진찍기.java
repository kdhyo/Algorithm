package level2.kakao;

public class 단체사진찍기 {

	private static final String[] friends = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"};
	private int answer = 0;
	private String[] datas;

	public int solution(int n, String[] data) {
		boolean[] isVisited = new boolean[8];
		this.datas = data;
		dfs("", isVisited);

		return answer;
	}

	private void dfs(String names, boolean[] isVisited) {
		if (names.length() == 7) {
			if (check(names)) {
				answer++;
			}
			return;
		}
		for (int i = 0; i < 8; i++) {
			if (!isVisited[i]) {
				isVisited[i] = true;
				String name = names + friends[i];
				dfs(name, isVisited);
				isVisited[i] = false;
			}
		}
	}

	private boolean check(String names) {
		for (String data : datas) {
			int position1 = names.indexOf(data.charAt(0));
			int position2 = names.indexOf(data.charAt(2));
			char op = data.charAt(3);
			int index = (data.charAt(4) - '0') + 1;
			if (op == '=') {
				if (!(Math.abs(position1 - position2) == index)) {
					return false;
				}
			} else if (op == '>') {
				if (!(Math.abs(position1 - position2) > index)) {
					return false;
				}
			} else if (op == '<') {
				if (!(Math.abs(position1 - position2) < index)) {
					return false;
				}
			}
		}
		return true;
	}

}
