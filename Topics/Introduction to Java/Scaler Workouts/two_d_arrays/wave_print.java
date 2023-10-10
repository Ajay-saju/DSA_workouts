package two_d_arrays;

import java.util.*;
import java.util.Scanner;

public class wave_print {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int m = scn .nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // int x =
                arr[i][j] = scn.nextInt();
            }
        }
        // System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(arr[i][j]);
        // }
        // }
        // System.out.print(3 % 2);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = n - 1; j >= n; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
