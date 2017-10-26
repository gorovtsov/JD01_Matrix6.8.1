package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Three {

	public static void main(String[] args) {
		
		int n = Input.nextInt(); //
		
		int[][] ar = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					ar[i][j] = n--;
				}
			}

		}
		
		Input.printMatrix(ar);
	}

}
