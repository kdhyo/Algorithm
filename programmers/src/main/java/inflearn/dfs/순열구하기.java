
package inflearn.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 순열구하기 {

	private int m;
	private int size;
	private int[] parameter;
	private int[] checkedArr;
	private int[] tmp;
	private List<String> result = new ArrayList<>();

	public List<String> solution(int m, int[] arr) {
		this.m = m;
		this.size = arr.length;
		this.parameter = arr;
		this.checkedArr = new int[this.size];
		this.tmp = new int[m];

		dfs(0);

		return result;
	}

	private void dfs(int level) {
		if (level == m) {
			result.add(Arrays.toString(tmp));
			return;
		}

		for (int i = 0; i < size; i++) {
			if (checkedArr[i] == 0) {
				tmp[level] = parameter[i];
				checkedArr[i] = 1;
				dfs(level + 1);
				checkedArr[i] = 0;
			}
		}
	}

}
