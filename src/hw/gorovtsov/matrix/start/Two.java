// 6.8.1.2

package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Two {

	public static void main(String[] args) {
		int n = Input.nextInt();

		int[][] ar = new int[n][n];

		ar[0][n-1] = 1;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if ((j == ar.length - i)) {
					ar[i][j - 1] = i + 1;
				}
			}

		}

		printMat(ar);

	}

	public static void printMat(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.print("\n");
		}
	}

}
