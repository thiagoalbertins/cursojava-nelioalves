package vetores2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos");
		
		int n = scanner.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		double valorTotal = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o nome do produto");
			String nome = scanner.nextLine();
			nome = scanner.nextLine();
			System.out.println("Digite o valor do produto");
			double preco = scanner.nextDouble();
			Produto a = new Produto(nome,preco);
			valorTotal = valorTotal + a.getPreco();
		}
		
		System.out.println("Média dos valores dos produtos: " + (valorTotal/n));
		
		scanner.close();
	}

}
