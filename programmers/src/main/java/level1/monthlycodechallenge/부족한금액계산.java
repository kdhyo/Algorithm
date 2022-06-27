package level1.monthlycodechallenge;

public class 부족한금액계산 {

	public long solution(int price, long money, int count) {
		for (int i = 1; i <= count; i++) {
			money -= price * i;
		}

		return money >= 0 ? 0 : Math.abs(money);
	}

}
