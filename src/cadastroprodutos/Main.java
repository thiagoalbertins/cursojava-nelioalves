package cadastroprodutos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = scanner.nextLine();
		System.out.println("Price: ");
		product.price = scanner.nextDouble();
		System.out.println("Stock: ");
		product.quantity = scanner.nextInt();
		
		System.out.println(product);
		
		scanner.close();
	}

}
