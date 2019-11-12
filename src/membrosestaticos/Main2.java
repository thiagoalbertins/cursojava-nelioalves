package membrosestaticos;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter radius: ");

		double radius = scanner.nextDouble();
		
		double c = Calculator.circunference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		scanner.close();

	}
}
