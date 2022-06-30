package level2;

import java.util.Arrays;

public class 전화번호목록 {

	public boolean solution(String[] phoneBook) {
		boolean answer = true;
		Arrays.sort(phoneBook);
		for (int i = 0; i < phoneBook.length - 1; i++) {
			if (phoneBook[i + 1].startsWith(phoneBook[i])) {
				answer = false;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		전화번호목록 solution = new 전화번호목록();
		boolean result = solution.solution(new String[]{"119", "97674223", "1195524421"});
	}

}
