//6.8.1.3
package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Three {

	public static void main(String[] args) {
		
		int n = Input.nextInt(); //ввожу целое число
		
		int[][] ar = new int[n][n]; //инициализирую масив

		//заполняю массив значениями
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					ar[i][j] = n--;
				}
			}

		}
		
		//вывожу
		Input.printMatrix(ar);
	}

}
