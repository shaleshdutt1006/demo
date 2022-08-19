import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Please enter the number you want to check is prime or not");
		int number = Input.nextInt();

		if (PrimeNumber(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	public static boolean PrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
