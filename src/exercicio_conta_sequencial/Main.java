package exercicio_conta_sequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = 50;

		while (i > 20) {
			System.out.println("Digite a quantidade de minutos:");
			int minutos = scanner.nextInt();
			if (minutos <= 100) {
				System.out.println("Conta a pagar: R$ 50,00\n====================\n");
			} else if (minutos > 100) {
				int conta = 50 + (minutos - 100) * 2;
				System.out.printf("Conta a pagar: R$ %d%n====================%n", conta);
			}
		}
		scanner.close();
	}

}
