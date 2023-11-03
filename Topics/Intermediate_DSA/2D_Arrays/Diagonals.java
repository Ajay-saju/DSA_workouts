// package 2D_Arrays;

import java.util.Arrays;

public class Diagonals {
    public static void main(String[] args) {
        int[][] SQmatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },

        };
        // printRightToLeftDiagonals(matrix);
        for (int i = 0; i < SQmatrix.length; i++) {
            System.out.println(Arrays.toString(SQmatrix[i]));
        }

        int[][] out = transpose(SQmatrix);
        for (int i = 0; i < SQmatrix.length; i++) {
            System.out.println(Arrays.toString(out[i]));
        }
        rotate90Degrees(SQmatrix);

    }

    // rotate a N*N metrices to 90 degrees
    public static void rotate90Degrees(int[][] arr) {
        // transpose + reverse every row

        arr = transpose(arr);
        int n = arr.length;

        for (int row = 0; row < n; row++) {

            int[] temp = arr[row];
            int i = 0;
            int j = temp.length - 1;
            while (i < j) {
                int temp2 = temp[j];
                temp[j] = temp[i];
                temp[i] = temp2;
            }
            arr[row] = temp;

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }

    }

    // Transpose of metrices
    public static int[][] transpose(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;

    }

    // print all right to left diagonals
    public static void printRightToLeftDiagonals(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for (int col = 0; col < colLength; col++) {
            int i = 0;
            int j = col;
            while (i < rowLength && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
                // System.out.println();
            }
        }
        System.out.println();
        for (int row = 1; row < rowLength; row++) {
            int i = row;
            int j = colLength - 1;
            while (i < rowLength && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;

            }
        }
    }
    // Print AntiDiagonal

    public static void antiDiagonal(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        int j = n - 1;
        while (i < n) {
            System.out.println(matrix[i][j]);
            i++;
            j--;

        }
    }

    // print principal diagonal mtrix

    public static void prinDiagonal(int[][] arr) {
        int n = arr.length;
        // int[] diagonal;??
        int i = 0;
        while (i < n) {
            System.out.println(arr[i][i]);
            i++;
        }

    }
}
