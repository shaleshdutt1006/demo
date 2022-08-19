import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many years you want to calculate for");

		int Year = sc.nextInt();
		int n = 12 * Year;
		System.out.println("Enter Principal loan amount");

		int P = sc.nextInt();

		System.out.println("Enter Rate percent");

		float R = sc.nextFloat();

		float r = R / (12 * 100);

		double payment = (P * r) / (1 - Math.pow(1 + r, -n));

		System.out.println("Your monthly payment is : " + payment);

	}

}
