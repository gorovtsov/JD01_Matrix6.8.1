package hw.gorovtsov.matrix.logic;

import java.util.Scanner;

public class Input {
	public static int nextInt() {
		
		Scanner sc = new Scanner(System.in);
		
		int x=0;
		
		System.out.println("Введите целое число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите целое число: ");
		}
		x = sc.nextInt();
		
		sc.close();
		
		return x;
	}
	public static void printMatrix(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.print("\n");
		}
	}
}
