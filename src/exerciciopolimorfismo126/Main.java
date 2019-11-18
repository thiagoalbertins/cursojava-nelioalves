package exerciciopolimorfismo126;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.println("Enter the numer os employees: ");

		int nEmployees = s.nextInt();

		for (int i = 1; i < (nEmployees + 1); i++) {

			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)?");
			char opcao = s.next().charAt(0);
			s.nextLine();
			System.out.println("Name: ");
			String name = s.nextLine();
			System.out.println("Hours: ");
			int hours = s.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = s.nextDouble();

			if (opcao == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = s.nextDouble();
				Employee a = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				lista.add(a);
			} else if (opcao == 'n') {
				Employee b = new Employee(name, hours, valuePerHour);
				lista.add(b);
			}
		}
		
		for (Employee c : lista) {
			System.out.println(c.getName() + " - $ " + c.payment());
		}
		s.close();

	}

}
