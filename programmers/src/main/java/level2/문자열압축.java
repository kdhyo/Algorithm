package level2;

public class 문자열압축 {

	public int solution(String s) {
		int answer = s.length();    // 압축하기 전 문자열 길이로 초기화

		for (int i = 1; i <= s.length() / 2; i++) {
			int zipLevel = 1;                           // 현재 압축정도
			String zipStr = s.substring(0, i);          // 압축할 문자
			StringBuilder result = new StringBuilder(); // 압축완료한 문자를 저장할 StringBuilder

			for (int j = i; j <= s.length(); j += i) {
				// 다음 문자 추출
				String next = s.substring(j, Math.min(j + i, s.length()));
				// 다음 문자와 현재 문자가 같으면 zipLevel증가
				if (zipStr.equals(next)) {
					zipLevel++;
				}
				// 다음 문자와 현재 문자가 다를 경우
				else {
					// (압축이 안됬을 경우는 공백, 압축이 됬을경우 zipLevel을 붙여줌) + 압축할 문자를 넣어줌,
					result.append(zipLevel != 1 ? zipLevel : "").append(zipStr);
					zipStr = next;      // 다음 문자를 압축할 문자로 지정
					zipLevel = 1;       // 압축 정도 1로 초기화
				}
			}
			result.append(zipStr);      // 마지막에 추가안된 zipStr추가
			answer = Math.min(answer, result.length()); // 가장 작은 문자열 길이 저장
		}

		return answer;
	}

	public static void main(String[] args) {
		문자열압축 solution = new 문자열압축();
		int result = solution.solution("abcabcabcabcdededededede");
		System.out.println("result = " + result);
	}

}
