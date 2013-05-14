public class Testprogram {

	public static void main(String args[]) {
		Dice Object = new Dice();

		for (int x = 0; x < 10; x++)
			Object.RollDice();

		for (int x = 0; x < 10; x++)
			System.out.println(Object.RollHistoryArray()[x]);

	}

}

// System.out.println("public dice count is\t" + Object.RollCount2());
//
// // implemented class triple dice and testing program
// TripleDice nobject = new TripleDice(3, 6);
// System.out.println("override and the triple dice value is\t"
// + nobject.RollDice());
// System.out.println("triple dice count is\t" + nobject.RollCount3());
//
// System.out.println("This causes program to reset triple dice rolled\t"
// + nobject.reset());



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




public class Dice {
	static int total = 0;
	int total2 = 0;
	int a[] = new int[10];
	int x = 0;

	static int RollDice(int NumOfDice, int sidesofdice) {
		total += NumOfDice;

		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));
	}

	public int RollDice() {

		total2++;
		a[x] = (1 + (int) (Math.random() * 6));
		return a[x++];
	}

	static int Roll_1_Dice() {
		total++;
		return 1 + (int) (Math.random() * 6);

	}

	static int RollCount() {

		return total;
	}

	public int RollCount2() {
		return total2;

	}

	public int[] RollHistoryArray() {
		return a;
	}

}
