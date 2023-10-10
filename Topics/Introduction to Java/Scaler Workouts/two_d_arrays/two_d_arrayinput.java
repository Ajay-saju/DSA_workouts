package two_d_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class two_d_arrayinput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // dataType[][] variable_name = new dataType[size][size];
        int[][] arr = new int[3][3];

        // 2 D array input
        System.out.println(arr.length); // it will gives the the row size or row length.

        // int row = arr.length;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
            }
        }
        scn.close();
        // printing the 2D array
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }
        for (int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }
    }
}
