package areatriangulo;

import java.util.Scanner;

public class AreaSemOO {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float p, a, b, c;

		System.out.println("Entre as medidas do triângulo x");

		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		
		p = (a + b + c) / 2;
		
		float area1 = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Entre as medidas do triângulo y");

		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		
		p = (a+ b + c) / 2;
		
		float area2 = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Área do triângulo X: "+ area1);
		System.out.println("Área do triângulo Y: "+ area2);
		if (area1>area2) {
			System.out.println("Área maior: X");
		} else if(area2>area1) {
			System.out.println("Área maior: Y");
		} else {
			System.out.println("Áreas iguais");
		}
		scanner.close();
	}

}
