package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		
		System.out.println();
		System.out.println("Product Data: " + product.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product.toString());

		System.out.println();
		System.out.print("Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product.toString());

		sc.close();
	}

}
