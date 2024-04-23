package CountSort;

import java.util.Arrays;

public class QuickSort {

    // impliment quicksort

    public static void main(String[] args) {

        int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };

        System.out.println(Arrays.toString(arr));

        int first = 0;
        int last = arr.length - 1;

        sort(arr, first, last);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int first, int last) {

        if (first < last) {

            int pivotIdx = findPivotIdx(arr, first, last);
            sort(arr, first, pivotIdx - 1);
            sort(arr, pivotIdx + 1, last);
        }

    }

    private static int findPivotIdx(int[] arr, int first, int last) {

        int pivot = arr[first];
        int l = first + 1;
        int r = last;

        while (l <= r) {
            if (arr[l] <= pivot) {
                l++;
            } else if (arr[r] > pivot) {
                r--;
            } else {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        swap(arr, first, r);
        return r;

    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
