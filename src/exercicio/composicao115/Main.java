package exercicio.composicao115;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = s.nextLine();

		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = s.nextLine();

		System.out.println("Level: ");
		String workerLevel = s.nextLine();

		System.out.println("Base Salary: ");
		double baseSalary = s.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.println("How many contracts to this worker? ");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");

			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(s.next());

			System.out.println("Value per hour: ");
			double valuePerHour = s.nextDouble();

			System.out.println("Duration (hours): ");
			int hours = s.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println("Enter month and year to calculate income(MM/YYYY): ");
		String monthAndYear = s.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName() + "\nDepartment: " + worker.getDepartment().getName()
				+ "\nIncome for " + monthAndYear + ": " + worker.income(year, month));

		s.close();
	}

}
