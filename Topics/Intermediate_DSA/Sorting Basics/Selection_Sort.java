// package Sorting Basics;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] A = { 2, 6, 4, 5, 5 };

        System.out.println(Arrays.toString(sortArray(A)));

    }

    public static int[] sortArray(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min_Index = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min_Index]) {
                    min_Index = j;
                }
                int temp = A[min_Index];
                A[min_Index] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
    // time complexity = O(n^2)
    // Space complexity = O(1)

}
