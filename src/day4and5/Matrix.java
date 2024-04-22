package day4and5;

import java.util.Scanner;

public class Matrix {
	int row;
	int column;
	int[][] matrix;
	

	public Matrix(int row, int column) {
		
		this.row = row;
		this.column = column;
		matrix = new int[row][column];
	}



	public void matrixFill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
