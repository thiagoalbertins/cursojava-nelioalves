package areatriangulo;

import java.util.Scanner;

public class AreaComOO {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre as medidas do tri�ngulo x");

		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		double areax = x.area();

		System.out.println("Entre as medidas do tri�ngulo y");

		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areay = y.area();

		System.out.println("�rea do tri�ngulo X: " + areax);
		System.out.println("�rea do tri�ngulo Y: " + areay);
		if (areax > areay) {
			System.out.println("�rea maior: X");
		} else if (areay > areax) {
			System.out.println("�rea maior: Y");
		} else {
			System.out.println("�reas iguais");
		}
		scanner.close();
	}

}
