package exerciciocomposicao118;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = s.nextLine();
		System.out.println("Email: ");
		String email = s.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(s.nextLine());
		
		Client c = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(s.nextLine());
		
		System.out.println("How many items to this order?: ");
		int nPedidos = s.nextInt();
		s.nextLine();
		
		Order order = new Order(new Date(), status, c);
		
		for (int i = 1; i < (nPedidos + 1); i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product name:");
			String n = s.nextLine();
			n = s.nextLine();
			System.out.println("Product price: ");
			Double p = s.nextDouble();
			System.out.println("Quantity: ");
			int q = s.nextInt();
			Product a = new Product(n, p);
			OrderItem b = new OrderItem(q, p, a);
			order.addItem(b);
		}
		System.out.println(order);
		s.close();
	}

}
