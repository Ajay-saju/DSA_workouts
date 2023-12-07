// package Sorting Basics;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 1, 9, 6, 4 };
        System.out.println(Arrays.toString(insertion(a)));

    }

    public static int[] insertion(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int j = i - 1;
            while ((j >= 0 && A[j] > A[j + 1])) {

                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                j--;

            }
        }
        return A;
    }

    // Time complexity
    // Worst case = o(n^2) eg= {9,8,7,6,5}
    // Besst case - O(n)
    // Space complexity - O(n)

}
