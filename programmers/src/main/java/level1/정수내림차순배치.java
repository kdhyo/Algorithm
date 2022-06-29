package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 정수내림차순배치 {

	public long solution(long n) {
		String str = Arrays.stream(String.valueOf(n)
				.split(""))
			.sorted(Collections.reverseOrder())
			.collect(Collectors.joining());
		return Long.parseLong(str);
	}

}
