import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int x = sc.nextInt();
		 * 
		 * if (x < 0) { System.out.println("NEGATIVO");
		 * 
		 * } else { System.out.println("NAO NEGATIVO"); } }
		 */

		/*
		 * int x = sc.nextInt();
		 * 
		 * if (x % 2 == 0) { System.out.println("PAR");
		 * 
		 * }else { System.out.println("ÍMPAR"); }
		 */

		/*
		 * int a = sc.nextInt(), b = sc.nextInt();
		 * 
		 * if ( a % b == 0 || b % a == 0 ) { System.out.println("SÃO MULTIPLOS"); }else
		 * { System.out.println("MÃO MULTIPLOS"); }
		 */

		/*
		 * int codigo = sc.nextInt(); int quantidade = sc.nextInt(); double valor;
		 * 
		 * if (codigo == 1) { valor = quantidade * 4.00; }else if (codigo == 2) { valor
		 * = quantidade * 4.50; }else if (codigo == 3) { valor = quantidade * 5.00;
		 * }else if (codigo == 4) { valor = quantidade * 2.00; }else { valor =
		 * quantidade * 1.50; } System.out.printf("Total: R$ %.2f", valor);
		 * 
		 */

		/*
		 * double a = sc.nextDouble();
		 * 
		 * if ( a <= 25.00 ) { System.out.println("INTERVALO [0,25]"); }else if (a
		 * <=50.00) { System.out.println("INTERVALO [25,50]"); }else if (a <=75.00) {
		 * System.out.println("INTERVALO [50,75]"); }else if (a<= 100) {
		 * System.out.println("INTERVALO [75,100]"); }else {
		 * System.out.println("FORA DO INTERVALO"); }
		 * 
		 */

		/*double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}*/

		/*
		 * double salario = sc.nextDouble();
		 * 
		 * double imposto; if (salario <= 2000.0) { imposto = 0.0; } else if (salario <=
		 * 3000.0) { imposto = (salario - 2000.0) * 0.08; } else if (salario <= 4500.0)
		 * { imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; } else { imposto =
		 * (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; }
		 * 
		 * if (imposto == 0.0) { System.out.println("Isento"); } else {
		 * System.out.printf("R$ %.2f%n", imposto); }
		 */
		sc.close();
	}
}
