package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int n = sc.nextInt(); double [] vect = new double [n];
		 * 
		 * for (int i=0; i<n; i++) { vect[i] = sc.nextDouble(); }
		 * 
		 * double sum = 0.0; for (int i=0;i<n;i++) { sum += vect[i]; } double avg = sum
		 * / n; System.out.printf("AVERAGE HEIGHT: %.2f\n", avg);
		 */

		/*
		 * int n = sc.nextInt(); Product[] vect = new Product[n];
		 * 
		 * for (int i=0; i<n; i++) { sc.nextLine(); String name = sc.nextLine(); double
		 * price = sc.nextDouble(); vect[i] = new Product(name, price); }
		 * 
		 * double sum = 0.0; for (int i=0; i<n; i++) { sum += vect[i].getPrice(); }
		 * double avg = sum /n; System.out.printf("AVERAGE PRICE: %.2f\n", avg);
		 */

		/*Student[] vect = new Student[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}*/

		sc.close();
	}
}