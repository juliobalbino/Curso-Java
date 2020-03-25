package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit?(y/n) ");
		char questionDeposit = sc.next().charAt(0);
		
		if (questionDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			
			acc = new Account(number, name, balance);
		}else {
			acc = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		acc.depositValue(value);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(acc.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		acc.withdrawValue(value);
		System.out.println();
		
		System.out.println("Updated account data:");
		System.out.println(acc.toString());
		
		
		
		
		sc.close();
	}

}
