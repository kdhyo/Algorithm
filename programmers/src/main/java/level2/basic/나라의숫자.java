package level2.basic;

public class 나라의숫자 {

	public String solution(int n) {
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "2";
		}
		if (n == 3) {
			return "4";
		}

		String[] nums = new String[]{"4", "1", "2"};
		StringBuilder sb = new StringBuilder();

		while (n > 0) {
			int remainder = n % 3;
			n /= 3;
			if (remainder == 0) {
				n -= 1;
			}

			sb.append(nums[remainder]);
		}

		sb.reverse();
		return sb.toString();
	}

}
