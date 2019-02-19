package alexHomework;

public class TestTR7n {
	public static void main(String[] args) {
		double returnValue = fahrenheitToCelsius(50);
		System.out.println(returnValue);

	}

	public static double fahrenheitToCelsius(double temperature) {
		return (temperature - 32) * (5.0 / 9.0);

	}
}
