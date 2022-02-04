package arrayExamples;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("Column : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        int[][] transposeMatrix = new int[col][row];
        matrixInput(row, col, matrix);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix");
        displayMatrix(matrix);
        System.out.println("Transpose of matrix");
        displayMatrix(transposeMatrix);
    }

    private static void matrixInput(int row, int col, int[][] matrix1) {
        for (int i = 0; i < row; i++) {
            Scanner scLine = new Scanner(System.in);
            System.out.println("Row " + (i + 1) + " elements");
            String line = scLine.nextLine();
            String[] intAsArray = line.split(" ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = Integer.parseInt(intAsArray[j]);
            }
        }
    }

    private static void displayMatrix(int[][] matrix1) {
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
