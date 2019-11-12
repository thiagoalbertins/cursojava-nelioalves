package exercicio_tempertura_repeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char opcao;

		do {
			System.out.println("Digite a temperatura em celsius:");
			float tempC = scanner.nextFloat();
			float tempF = (9 * tempC / 5) + 32;
			System.out.println("Equivalente em Fahrenheit:" + tempF);
			System.out.println("Deseja repetir (s/n)");
			opcao = scanner.next().charAt(0);
		} while (opcao == 's');

		scanner.close();
	}

}
