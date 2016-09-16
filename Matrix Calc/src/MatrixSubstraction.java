import java.util.Scanner;
import java.util.stream.IntStream;

public class MatrixSubstraction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");

		int row = sc.nextInt();

		System.out.println("Enter the number of columns");

		int cols = sc.nextInt();

		int[][] matrix1 = new int[row][cols];
		int[][] matrix2 = new int[row][cols];
		int[][] sub = new int[row][cols];

		System.out.println("Enter the data for first matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the data for second matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Matrix = ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println("Second Matrix = ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix2[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println("Substraction = ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.println(sub[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
