package session02;

public class OperatorThings {
	public static void main(String[] args) {

		int n = 7;
		n++;
		System.out.println(n);
		System.out.println(n++);

		n = 0;
		n = n++ + 5;

		System.out.println(n);

		n = -n;

		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		System.out.println(10 - 3);
		System.out.println(10 + 3 * 5 - 7);
		System.out.println((10 + 3) * (5 - 7));

		System.out.println(10 << 2);

		System.out.println(10 >> 2);
		System.out.println(10 >>> 2);
		System.out.println(-10 >> 2);// leftmost bit is reserved for negative sign ... the sign is kept and results
										// in
		System.out.println(-10 >>> 2);// here the bit for the negative sign is shifted, turning from 1 to zero

		// comparison operators

		int n2 = 7;
		System.out.println(n2 > 10); // result is of the boolean type
		System.out.println(n2 < 10);
		System.out.println(n2 = 10); // assigns the value to the int n.
		System.out.println(n2 == 10);
		System.out.println(n2 != 10);

		System.out.println(10 & 5);
		System.out.println(10 | 5);
		System.out.println(10 ^ 5);

		System.out.println(n2 > 1 && n2 < 11);
		System.out.println(n2 > 1 || n2 < 11);
		System.out.println(n2 > 1 & n2 < 11);
		System.out.println(n2 > 1 | n2 < 11);

		System.out.println(isNumber(n2) && n2 > 1);
		System.out.println(n2 > 1 && isNumber(n2));
		System.out.println(n2 < 1 & isNumber(n2));

		n2 += 1; // n2 = n2 +1
		n2 += 10;
		n2 = 5;

		System.out.println(n2 > 4 ? "Admis" : "Respins");
		System.out.println(n2 > 4 ? (n2 > 8 ? "Foarte bine" : "Decent") : "Respins");

	}

	private static boolean isNumber(int n2) {
		System.out.println("Am fost aici");
		return false;

	}

}
