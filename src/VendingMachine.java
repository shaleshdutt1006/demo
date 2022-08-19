import java.util.Scanner;

public class VendingMachine {

	public static void countCurrency(int amount) {
		int[] notes = new int[] { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int[] noteCounter = new int[9];

		for (int i = 0; i < 9; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}

		System.out.println("Currency Count ->");
		for (int i = 0; i < 9; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of notes you want to change ");

		int amount = sc.nextInt();
		countCurrency(amount);
	}

}