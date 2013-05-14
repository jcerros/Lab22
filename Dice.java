public class Dice {
  static int total = 0;
	int total2 = 0;
	int a[]=new int[10];
	int x = 0;

	static int RollDice(int NumOfDice, int sidesofdice) {
		total += NumOfDice;

		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));
	}

	public int RollDice() {
		
		total2++;
		a[x]= (1 + (int) (Math.random() * 6));
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

	}public int[] RollHistoryArray(){
		return a;
	}

}
