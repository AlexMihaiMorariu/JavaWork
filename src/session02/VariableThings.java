package session02;

public class VariableThings {
	int variabilaMembru; // declaring it this was or =0 is the same for initialization
	static int variabilaStatica; // it takes part of the certain class... can be seen by all objects
	// important when specifying a variable... name begins lower case, next word
	// starts with upper case.
	static final double CONSTANTA_PI = 3.14; // declaring constants must be upper case and separated with _
	// final is a key word meaning you can't modify this constant value
	// CONSTANTA_PI = 2.14; will return an error due to modifying its value.
	// Removing final will make the constant executable

	public static void main(String[] args) {// the last type of variable
		int variabilaLocala = 7; // difference can be seen between method and class placement. This one is just
		method(5); // part of the method.
		System.out.println(variabilaLocala);
		System.out.println(variabilaStatica);
		// System.out.println(variabilaMembru); // cannot be called because it is part
		// of a class

	}

	private static void method(int parametru) {
		System.out.println(parametru);

	}

}
