package membrosestaticos;

import java.util.Scanner;

public class Main1 {

	public static final double PI = 3.14159;

	// Não é possível chamar um método não estático dentro de um estático como a
	// Main, por exemplo.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = scanner.nextDouble();

		double c = circunference(radius);

		double v = volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		scanner.close();

	}

	public static double circunference(double radius) {
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}

}
