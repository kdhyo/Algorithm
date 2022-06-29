package level1;

public class 핸드폰번호가리기 {

	public String solution(String phoneNumber) {
		int size = phoneNumber.length() - 4;

		String star = "*".repeat(size);
		return star + phoneNumber.substring(size);
	}

	/**
	 * 정규식으로 하려다 포기했는데 깔꼼..
	 */
	public String solution2(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}

}
