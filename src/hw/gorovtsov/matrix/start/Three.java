//6.8.1.3
package hw.gorovtsov.matrix.start;

import hw.gorovtsov.matrix.logic.Input;

public class Three {

	public static void main(String[] args) {
		
		int n = Input.nextInt(); //����� ����� �����
		
		int[][] ar = new int[n][n]; //������������� �����

		//�������� ������ ����������
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j) {
					ar[i][j] = 5;
					
				}
			}

		}
		
		//������
		Input.printMatrix(ar);
	}

}
