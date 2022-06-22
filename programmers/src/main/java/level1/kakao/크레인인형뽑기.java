package level1.kakao;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class 크레인인형뽑기 {

	public int solution(int[][] board, int[] moves) {
		int size = board.length;
		CustomStack stack = new CustomStack();

		for (int move : moves) {
			move = move - 1;
			for (int i = 0; i < size; i++) {
				if (board[i][move] != 0) {
					stack.game(board[i][move]);
					board[i][move] = 0;
					break;
				}
			}
		}

		return stack.getBang();
	}

	static class CustomStack {

		Deque<Integer> stack;
		int bang = 0;

		CustomStack() {
			stack = new ArrayDeque<>();
		}

		public void game(Integer i) {
			if (Objects.equals(stack.peekLast(), i)) {
				stack.removeLast();
				bang += 2;
			} else {
				stack.addLast(i);
			}
		}

		public int getBang() {
			return bang;
		}
	}

}
