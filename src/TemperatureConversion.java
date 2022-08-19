import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Please select Option 1. Celsius to Fahrenheit or Option 2.Fahrenheit to Celsius ");

		int option = sc.nextInt();

		if (option == 1) {
			System.out.println("Enter celsius value you want to convert to fahrenheit");

			Scanner one = new Scanner(System.in);

			float C = one.nextFloat();

			float celsius = (C * 9 / 5) + 32;
			System.out.println("Temperature in fahrenheit is : " + celsius);
		} else if (option == 2) {

			System.out.println("Enter Fahrenheit value you want to convert to Celsius");

			Scanner two = new Scanner(System.in);

			float F = two.nextFloat();

			float fahrenheit = ((F - 32) * 5) / 9;

			System.out.println("Temperature in Celsius is : " + fahrenheit);

		} else {
			System.out.println("Please Enter valid input");
		}
	}

}
