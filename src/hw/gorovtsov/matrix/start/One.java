// 6.8.1.1

package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.*;

public class One {

	public static void main(String[] args) {
		int n = Input.nextInt();

		int[][] ar = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 != 0) {
					ar[i][j] = n - j;
				} else {
					ar[i][j] = j + 1;
				}
			}

		}

		Input.printMatrix(ar);

		

	}

}
