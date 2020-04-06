package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Course> ca = new HashSet<>();
		Set<Course> cb = new HashSet<>();
		Set<Course> cc = new HashSet<>();

		System.out.print("How many students for a course A?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			ca.add(new Course(number));
		}

		System.out.print("How many students for a course B?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			cb.add(new Course(number));
		}

		System.out.print("How many students for a course C?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			cc.add(new Course(number));
		}

		Set<Course> total = new HashSet<>(ca);
		total.addAll(cb);
		total.addAll(cc);

		System.out.print("Total students: " + total.size());

		sc.close();
	}

}
