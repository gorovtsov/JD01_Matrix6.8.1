//6.8.1.5
package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Five {

	public static void main(String[] args) {
		int n = Input.nextInt(); // принимаю число

		int[][] ar = new int[n][n]; // инициализирую массив массивов

		// заполняю массив
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if ((i == 0) || (j == 0) || (i == ar.length-1) || (j == ar.length-1)) {
					ar[i][j] = 1;
				}
			}

		}

		// вывожу
		Input.printMatrix(ar);
	}

}
