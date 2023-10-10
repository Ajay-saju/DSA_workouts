package two_d_arrays;

import java.util.Arrays;

public class two_d_array_printing {
    // input 2D array elements
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // System.out.print(findSum(arr));
        // waveForm(arr);
        System.out.print(Arrays.toString(rowWiseSum(arr)));
    }

    public static int findSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                sum += arr[row][col];
            }
        }
        return sum;
    }

    public static int waveForm(int[][] arr) {
        int m = arr[0].length;
        for (int row = 0; row < arr.length; row++) {

            if (row % 2 != 0) {

                for (int col = m - 1; col >= 0; col--) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int col = 0; col < m; col++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
        return 0;

    }

    public static int[] rowWiseSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[] newRow = new int[n];
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < m; col++) {
                sum += arr[row][col];
            }
            newRow[row] = sum;
        }
        return newRow;
    }
    public static int [] maxCol(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] newArray = new int[m];
        
        return newArray;
    }
}
