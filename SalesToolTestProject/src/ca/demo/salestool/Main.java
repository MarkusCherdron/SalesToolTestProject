package ca.demo.salestool;

public class Main {

	public static void main(final String[] args) {
		final SalesData data = new SalesData();
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This App Shows Sales Data");

		System.out.println("Test 1");

	}
}
