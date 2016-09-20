import java.util.Scanner;

public class MatrixTransponse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe wierszy: ");
		int rows = sc.nextInt();
		System.out.println("Podaj liczbe kolumn:");
		int column = sc.nextInt();

		int[][] matrix = new int[rows][column];
		int[][] transpose = new int[column][rows];

		System.out.println("Wprowadz dane do macierzy:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Macierz:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Macierz transponowana: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
