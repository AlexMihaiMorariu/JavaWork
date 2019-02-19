package alexHomework;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Introduce the sum in Euro: ");
		int currency = info.nextInt();
		System.out.println("The Exchange rate is: ");
		double exchange = info.nextDouble();
		double sumInRon = currency * exchange;
		System.out.println("The sum in RON is: " + sumInRon);

		info.close();

	}

}
