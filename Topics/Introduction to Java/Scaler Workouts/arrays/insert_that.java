package arrays;

import java.util.Scanner;

public class insert_that {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n + 2];
        // System.out.println("Enter Array Elemets");
        // for (int i = 1; i <= n; i++) {
        // arr[i] = scn.nextInt();
        // }
        // // System.out.println(n);
        // n++;
        // System.out.println("Enter a num");
        // int pos = scn.nextInt();
        // System.out.println("Value: ");
        // int val = scn.nextInt();
        // insertNum(arr, pos, val, n);
        // }

        // public static int insertNum(int[] arr, int pos, int val, int n) {
        // // System.out.println(arr.length);
        // // System.out.println(n);
        // for (int i = n; i > pos; i--) {
        // arr[i] = arr[i - 1];
        // }
        // arr[pos] = val;
        // for (int i = 1; i <= n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // return 0;
        // }
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n + 2];
        int pos = scn.nextInt();
        int val = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            arr[i] = scn.nextInt();
        }
        n++;
        insetNum(arr, pos, val, n);
    }

    public static int insetNum(int arr[], int pos, int value, int n) {
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }
}
