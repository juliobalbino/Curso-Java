package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int n = sc.nextInt();
		
		int[][] mat = new int [n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count =0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		*/
		
		int m =sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x =sc.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}


