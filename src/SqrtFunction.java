import java.util.Scanner;

public class SqrtFunction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number you want square root of : ");

		double c = sc.nextInt();

		double t = c;

		double epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

}
