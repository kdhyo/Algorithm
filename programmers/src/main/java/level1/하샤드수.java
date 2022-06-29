package level1;

import java.util.Arrays;

public class 하샤드수 {

	public boolean solution(int x) {
		int sum = Arrays
			.stream
				(Integer
					.toString(x)
					.split("")
				)
			.mapToInt(Integer::parseInt)
			.sum();

		return x % sum == 0;
	}

}
