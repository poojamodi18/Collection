package arrayExamples;

import java.util.Scanner;

//add two matrix using multi dimensional array
public class MatrixCalculation {
    /*TODO : make a switch case program for matrix
           addition
           multiplication
           Transpose of matrix
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("Column : ");
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] sum = new int[row][col];

        System.out.println("1st Matrix value");
        matrixInput(row, col, matrix1);
        matrixInput(row, col, matrix2);
        System.out.println("Matrix 1");
        displayMatrix(matrix1);
        System.out.println("Matrix 2");
        displayMatrix(matrix2);

        matrixSum(row, col, matrix1, matrix2, sum);
        System.out.println("Answer of matrix addition");
        displayMatrix(sum);
        System.out.println("Answer of matrix multiplication");
        matrixMultiplication(row,col,matrix1,matrix2,sum);
        displayMatrix(sum);
    }

    private static void matrixSum(int row, int col, int[][] matrix1, int[][] matrix2, int[][] sum) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    private static void matrixMultiplication(int row, int col, int[][] matrix1, int[][] matrix2, int[][] sum) {
        //TODO: matrix multiplication
    }

    private static void displayMatrix(int[][] matrix1) {
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void matrixInput(int row,int col, int[][] matrix1) {
        for (int i = 0; i < row; i++) {
            Scanner scLine = new Scanner(System.in);
            System.out.println("Row "+(i+1)+" elements");
            String line = scLine.nextLine();
            String[] intAsArray = line.split(" ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = Integer.parseInt(intAsArray[j]);
            }
        }
    }
}
