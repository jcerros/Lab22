public class Testprogram {

  public static void main(String args[]) {
		Dice Object = new Dice();
		
		for(int x=0;x<10;x++)
		Object.RollDice();

		for(int x=0;x<10;x++)	
		System.out.println(Object.RollHistoryArray()[x]);
		
	
		
		
	
	}

}

//System.out.println("public dice count is\t" + Object.RollCount2());
//
//// implemented class triple dice and testing program
//TripleDice nobject = new TripleDice(3, 6);
//System.out.println("override and the triple dice value is\t"
//		+ nobject.RollDice());
//System.out.println("triple dice count is\t" + nobject.RollCount3());
//
//System.out.println("This causes program to reset triple dice rolled\t"
//		+ nobject.reset());
