// Example 12.9: Creating a 2D array

import java.util.Scanner;

public class Example12_9 {

    int[][] a;      // Declared that a is an array of two-dimensional
    int row;        // The number of rows
    int col;        // The number of columns

    Example12_9(int row, int col) {
        a = new int[row][col];
        this.row = row;
        this.col = col;
    }

    public void initialize() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter a[%d][%d]: ", i, j);
                a[i][j] = in.nextInt();
            }
        }
    }

    // Display the matrix in Row-Major order
    public void printRowMajor() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display the matrix in Column-Major order
    public void printColMajor() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Defining a method for 2D matrix addition
    public int[][] addition(int[][] b) {
        if (this.row != b.length || this.col != b[0].length) {
            System.out.println("Error! Matrices are not of proper size.");
            return null;
        }

        int[][] c = new int[row][col];  // Declare the output matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = this.a[i][j] + b[i][j];
            }
        }
        return c;
    }

    // Defining a method for 2D matrix multiplication
    public int[][] multiplication(int[][] b) {
        if (this.col != b.length) {
            System.out.println("Error! Matrices are not of proper size.");
            return null;
        }

        int[][] c = new int[row][b[0].length];  // Declare the output matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += this.a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Creating first 2D array (3x4):");
        Example12_9 x = new Example12_9(3, 4);
        x.initialize();

        System.out.println("Creating second 2D array (3x4):");
        Example12_9 y = new Example12_9(3, 4);
        y.initialize();

        System.out.println("Matrix addition result:");
        int[][] z = x.addition(y.a);
        if (z != null) {
            for (int[] row : z) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Matrix multiplication result:");
        z = x.multiplication(y.a);
        if (z != null) {
            for (int[] row : z) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}
