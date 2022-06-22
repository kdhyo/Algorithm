package level1.kakao;

/**
 * https://www.youtube.com/watch?v=jFv2LRVCK6s
 * 강의보고 해결..
 * row col 생각해내지 못한 내가 바보같아!
 */
public class 키패도누르기 {

	Position left;
	Position right;
	Position numPos;

	public String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		// 1. 왼손 오른손 위치를 초기화
		left = new Position(3, 0);
		right = new Position(3, 2);

		for (int num : numbers) {
			// 2. 숫자를 누를 손가락 정하기
			numPos = new Position((num - 1) / 3, (num - 1) % 3);
			if (num == 0) {
				numPos = new Position(3, 1);
			}
			String finger = numPos.getFinger(hand);
			answer.append(finger);
			if (finger.equals("L")) {
				left = numPos;
			} else {
				right = numPos;
			}

		}

		return answer.toString();
	}

	private class Position {

		private int row;
		private int col;

		Position(int row, int col) {
			this.row = row;
			this.col = col;
		}

		public String getFinger(String hand) {
			String finger = hand.equals("right") ? "R" : "L";

			if (this.col == 0) {
				finger = "L";
			} else if (this.col == 2) {
				finger = "R";
			} else {
				int leftDist = left.getDistance(this);
				int rightDist = right.getDistance(this);

				if (leftDist < rightDist) {
					finger = "L";
				} else if (leftDist > rightDist) {
					finger = "R";
				}
			}

			return finger;
		}

		private int getDistance(Position position) {
			return Math.abs(this.row - position.row) + Math.abs(this.col - position.col);
		}
	}
}
