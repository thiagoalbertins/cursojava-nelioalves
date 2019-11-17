package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int tamanho = scanner.nextInt();
		double[] vetor = new double[tamanho];
		double alturaTotal = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextDouble();
			alturaTotal = alturaTotal + vetor[i];
		}
		
		double media = alturaTotal / tamanho;
		System.out.printf("%.2f",media);
		
		scanner.close();
	}

}
