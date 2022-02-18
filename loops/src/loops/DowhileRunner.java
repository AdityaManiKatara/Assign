package loops;

import java.util.Scanner;

public class DowhileRunner {

	public static void main(String[] args) {

		int result = 0;

		Scanner scanner = new Scanner(System.in);

		int num = 0;

		do {

			System.out.println("Enter the number - ");

			int number = scanner.nextInt();

			if (number >= 0) {
				result = number * number * number;

				System.out.println("Cube of the Number is = " + result);
			} else {

				System.out.println("Wrong input");
				scanner.close();
			}

			num = number;

			num++;
		} while (num > 0);

	}

}
