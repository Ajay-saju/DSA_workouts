package arrays;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = scn.nextInt();
        // }
        int[] arr = { 4, 10, 50, 40, 80 };
        System.out.print(findSum(arr));

    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
