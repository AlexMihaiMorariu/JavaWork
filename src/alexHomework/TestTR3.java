package alexHomework;

import java.util.Scanner;

public class TestTR3 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int number = info.nextInt();
		System.out.println("The number squared is: " + number * number);
		System.out.println("The number cubed is: " + number * number * number);

		info.close();
	}

}
