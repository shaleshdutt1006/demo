import java.util.Scanner;

public class demoVendingMachine {

	
int[] array;
array = new int[8];
array[0] = 1;
array[1] = 2;
array[2] = 5;
array[3] = 10;
array[4] = 50;
array[5] = 100;
array[6] = 500;
array[7] = 1000;

Scanner sc = new Scanner(System.in);

System.out.print("Enter number of notes you want to change ");

int notes = sc.nextInt();

for (int i = 7; i >= 0; i--) {

	if (notes % array[i] == 0) {

		int rem = notes / array[i];
		System.out.println("notes of" + array[i] + "is" + rem);

		rem = notes - array[i] * rem;

		for (int l = 6; l >= 0; l--) {
			rem = rem / array[l];
			if (rem == 1) {
				break;
			} else {
				rem = notes - array[l];
			}

		}

//		System.out.println("we need number of notes of " + array[i] + " is " + a);
//		notes = notes - array[i];
	}

}
}
}
