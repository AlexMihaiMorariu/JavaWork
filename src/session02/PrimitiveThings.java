package session02;

public class PrimitiveThings {
	public static void main(String[] args) {

		byte b = 100;
		System.out.println(b);

		byte b2 = (byte) 200; // normally 200 would result in an error, but can cast (byte) which will
								// influence result
		int n = (int) 13.7;

		System.out.println(n);
		System.out.println(b2);

		char ch = 'A';
		ch++;
		System.out.println(ch);

		int n2 = ch;
		System.out.println(n2);

		char ch2 = '\''; // special characters you must put a backslash \ in order to print them

		System.out.println(ch2);

		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);

	}

}
