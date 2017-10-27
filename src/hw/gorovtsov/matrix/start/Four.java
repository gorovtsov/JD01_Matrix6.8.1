//6.8.1.4
package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Four {

	public static void main(String[] args) {
		int n = Input.nextInt(); // принимаю число

		int[][] ar = new int[n][n]; // инициализирую массив массивов

		// заполняю массив
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j) {
					ar[i][j] = (i + 1) * (i + 2);

				}
			}

		}

		// вывожу
		Input.printMatrix(ar);

	}

}
