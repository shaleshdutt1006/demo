import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int i = 0;
		int[] array;
		array = new int[1000];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the decimal value you want to change : ");

		int number = sc.nextInt();
		while (number > 0) {
			{
				array[i] = number % 2;
				number = number / 2;
				i++;
				System.out.print(array[i] + " ");
//				
			}
		}

		for (int j = i - 1; j >= 0; j--) {
			array[i] = (array[j]);
			System.out.print(array[i]);

		}

	}
}
