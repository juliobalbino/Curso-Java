package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.JuridicPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthSpending));
			} else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				list.add(new JuridicPerson(name, annualIncome, employeesNumber));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");

		for (Person per : list) {
			System.out.print(per.taxesPaid());
		}

		double sum = 0.0;
		
		for (Person per : list) {
			sum += per.taxCalculation();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
