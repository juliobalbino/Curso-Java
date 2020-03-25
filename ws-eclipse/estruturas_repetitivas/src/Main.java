import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int x = sc.nextInt();
		 * 
		 * 
		 * while (x != 2002) { System.out.println("Senha Invalida"); x = sc.nextInt(); }
		 * System.out.println("Acesso Permitido"); }
		 */

		/*
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { if (x > 0 && y > 0) {
		 * System.out.println("Primeiro"); } else if (x > 0 && y < 0) {
		 * System.out.println("segundo"); } else if (x < 0 && y < 0) {
		 * System.out.println("terceiro"); } else { System.out.println("quarto"); }
		 * 
		 * x = sc.nextInt(); y = sc.nextInt(); }
		 */

		/*
		 * int x = sc.nextInt(); int alcool = 0; int gasolina = 0; int diesel = 0;
		 * 
		 * while (x != 4) { switch (x) { case 1: gasolina += 1; break; case 2: alcool +=
		 * 1; break; case 3: diesel += 1; break; default:
		 * System.out.println("Valor inválido"); break; }
		 * 
		 * x = sc.nextInt(); } System.out.println("MUITO OBRIGADO!");
		 * System.out.println("Gasolina: " + gasolina); System.out.println("Álcool: " +
		 * alcool); System.out.println("Diesel: " + diesel);
		 * 
		 * }
		 */

		/*
		 * int x = sc.nextInt();
		 * 
		 * for (int i = 1; i <= x; i++) {
		 * 
		 * if (i % 2 != 0) { System.out.println(i);
		 * 
		 * } }
		 */
		/*
		 * int n= sc.nextInt(); int in = 0; int out = 0;
		 * 
		 * for (int i=1; i<=n; i++ ) { int x=sc.nextInt();
		 * 
		 * if (x >=10 && x<=20) { in++; }else { out++; } } System.out.println(in +
		 * "in"); System.out.println(out + "out");
		 */

		/*
		 * int n=sc.nextInt();
		 * 
		 * 
		 * double media = 0;
		 * 
		 * for (int i=1; i<=n; i++) {
		 * 
		 * double a= sc.nextDouble(); double b= sc.nextDouble(); double c=
		 * sc.nextDouble();
		 * 
		 * media= (a * 2 + b * 3 + c * 5)/10;
		 * 
		 * System.out.printf("%.1f", media); }
		 */

		/*
		 * int n=sc.nextInt();
		 * 
		 * for (int i=1; i<=n; i++) { int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * 
		 * if (b == 0) { System.out.println("divisao impossivel"); }else { double div =
		 * (double) a / b; System.out.printf("%.1f", div); }
		 * 
		 * }
		 */

		/*
		 * int n = sc.nextInt();
		 * 
		 * int fat = 1;
		 * 
		 * for (int i=1; i<=n;i++) {
		 * 
		 * fat = fat * i; }
		 * 
		 * System.out.println(fat);
		 */

		/*
		 * int n = sc.nextInt(); int div = 0; for (int i=1; i<=n;i++) {
		 * 
		 * if (n % i == 0) { System.out.println(i); } }
		 */

		/*
		 * int n=sc.nextInt();
		 * 
		 * for (int i=1; i<=n; i++) { int quad = i * i; int cubo = i *i *i;
		 * System.out.println(i+ " "+ quad+ " "+ cubo); }
		 * 
		 * sc.close();
		 * 
		 */

		/*double C = 0;
		double F = 0;
		char verdade;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = (9 * C / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.print("Deseja repetir (s/n)?: ");
			verdade = sc.next().charAt(0);

		} while (verdade != 'n');
		System.out.println("Programa Encerrado");
	*/
		sc.close();
		
	}
	
	
}