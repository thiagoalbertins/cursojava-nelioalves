package exerciciopolimorfismo127;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner s = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = s.nextInt();
		s.nextLine();

		for (int i = 1; i < (n + 1); i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Commom, used or imported (c/u/i)?");
			char opcao = s.next().charAt(0);
			s.nextLine();
			System.out.print("Name: ");
			String name = s.nextLine();
			System.out.print("Price: ");
			double price = s.nextDouble();
			s.nextLine();

			if (opcao == 'i') {
				System.out.print("Customs fee:");
				double customFee = s.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else if (opcao == 'c') {
				list.add(new Product(name, price));
			} else if (opcao == 'u') {
				System.out.println("Manufature date (DD/MM/YYY):");
				Date manufactureDate = sdf.parse(s.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
			}

		}
		System.out.println("PRICE TAGS:");
		
		for (Product c : list) {
			System.out.println(c.priceTag());
		}
		s.close();
	} 
}
