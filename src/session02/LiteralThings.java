package session02;

public class LiteralThings {
	public static void main(String[] args) {

		int n = 1000;
		n = 0xFFFF;
		n = 0b01110110;
		long l = 1_000_000_000L; // this is viewed as a long with an L at the end.

		double dbl = 3.14;
		float f = 3.14F;

		System.out.println(n);
		System.out.println(l);
		System.out.println(dbl);
		System.out.println(f);

		// String s = null;

	}

}
