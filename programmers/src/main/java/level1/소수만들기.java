package level1;

public class 소수만들기 {

	int[] nums;
	int size;
	int answer = 0;

	public int solution(int[] nums) {
		this.nums = nums;
		this.size = nums.length;

		def(0, 0, 0);

		return answer;
	}

	private void def(int idx, int sum, int count) {
		if (count == 3) {
			if (sum % 2 == 0) {
				return;
			}
			for (int i = 2; i * i <= sum; i++) {
				if (sum % i == 0) {
					return;
				}
			}
			answer++;
			return;
		}

		if (idx == size) {
			return;
		}

		def(idx + 1, sum + nums[idx], count + 1);
		def(idx + 1, sum, count);
	}

	public static void main(String[] args) {
		소수만들기 test = new 소수만들기();
		test.solution(new int[]{1, 2, 3, 4});
	}

}
