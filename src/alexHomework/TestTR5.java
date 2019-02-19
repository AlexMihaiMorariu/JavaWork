package alexHomework;

import java.util.Scanner;

public class TestTR5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Introduce a sum in RON: ");
		int ron = info.nextInt();
		System.out.println("The exchange rate for EUR/RON is: ");
		double eur = info.nextDouble();
		System.out.println("The sum in Euro to be recieved is: " + (int) (ron / eur));
		int remainder = (int) (ron % eur);
		System.out.println("The remainder in RON is: " + remainder);

		info.close();

	}

}
