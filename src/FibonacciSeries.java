import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, number, NextTerm = 0;

		System.out.println("Please Enter which number you want to check");

		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();

		for (int i = 0; i <= number; i++) {
			NextTerm = a + b;
			a = b;
			b = NextTerm;
			System.out.print(NextTerm + " , ");
		}
		System.out.println();

		System.out.print("Sum of fibonacci Series is " + NextTerm);

	}

}
