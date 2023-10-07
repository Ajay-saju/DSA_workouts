package arrays;

import java.util.Scanner;

public class revers_nums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elemets");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        reverseArray(arr);
    }

    public static int reverseArray(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        return 0;
    }

}
