package areatriangulo;

import java.util.Scanner;

public class AreaComOO {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre as medidas do triângulo x");

		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		double areax = x.area();

		System.out.println("Entre as medidas do triângulo y");

		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areay = y.area();

		System.out.println("Área do triângulo X: " + areax);
		System.out.println("Área do triângulo Y: " + areay);
		if (areax > areay) {
			System.out.println("Área maior: X");
		} else if (areay > areax) {
			System.out.println("Área maior: Y");
		} else {
			System.out.println("Áreas iguais");
		}
		scanner.close();
	}

}
