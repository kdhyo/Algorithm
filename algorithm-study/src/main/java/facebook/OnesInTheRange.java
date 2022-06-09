package facebook;

public class OnesInTheRange {

	static final int[] arr = new int[]{0, 0, 1, 0, 1};
	static int[] ones = new int[arr.length];

	public OnesInTheRange() {
		ones[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ones[i] = ones[i - 1] + arr[i];
		}
	}

	public int numOfOnes(int s, int e) {
		return s == 0 ? ones[e] : ones[e] - ones[s - 1];
	}

}
