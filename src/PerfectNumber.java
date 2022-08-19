import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number you want to check");

		int number = sc.nextInt();

		for (int i = 1; i < number; i++)

			if (number % i == 0) {
				{
					sum = sum + i;
				}

			}
		if (sum == number) {
			System.out.println("This is a perfect number");
		} else {
			System.out.println("This is a non perfect number");
		}
	}

}

//A perfect number is a number sum of factors of which is equal to number
// itself