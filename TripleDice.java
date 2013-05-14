public class TripleDice extends Dice {
  int num, cara;
	int total3;

	public TripleDice(int dinum, int six) {
		num = dinum;
		cara = six;
	}

	@Override
	public int RollDice() {
		total3 += num;
		return (num + (int) (Math.random() * cara * num));
	}

	public int RollCount3() {
		return total3;

	}

	public int reset() {

		total3 = 0;

		return total3;

	}
}
