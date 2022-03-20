package stack.oceanview;

import java.util.ArrayDeque;
import java.util.Deque;

public class OceanView {

	public int[] findOceanViewBuildings(int[] heights) {
		Deque<Integer> indexList = new ArrayDeque<>();
		Deque<Integer> numbers = new ArrayDeque<>();
		int max = heights[0];

		indexList.addLast(0);
		numbers.addLast(heights[0]);
		for (int i = 1; i < heights.length; i++) {
			if (max == heights[i]) {
				indexList.clear();
				numbers.clear();

				max = heights[i];
				indexList.addLast(i);
				numbers.addLast(max);
				continue;
			}

			while (!numbers.isEmpty() && heights[i] >= numbers.peekLast()) {
				numbers.removeLast();
				indexList.removeLast();
			}
			indexList.addLast(i);
			numbers.addLast(heights[i]);
		}

		int[] array = new int[indexList.size()];
		int count = 0;
		for (Integer index : indexList) {
			array[count++] = index;
		}

		return array;
	}

}
