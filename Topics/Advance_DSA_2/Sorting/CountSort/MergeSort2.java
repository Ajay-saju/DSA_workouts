package CountSort;
import java.util.Arrays;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] a = { 3, 10, 6, 8, 15, 2, 12, 18, 17 };
        System.out.println(Arrays.toString(a));
        mergeSortarr(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));



        // T.C = O(n log n)
        // s.c = O(log n )
    }

    private static void mergeSortarr(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = (l + r) / 2;
        mergeSortarr(arr, l, mid);
        mergeSortarr(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    private static void merge(int[] arr, int l, int mid, int r) {

        // find length of left array and right array

        int leftArrLen = mid - l + 1;
        int rightArrlen = r - mid;

        // create 2 array using this length

        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrlen];

        // add elements to the array

        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[l + i];
        }

        // int rightIndex = 0;
        // for (int j = mid + 1; j <= r; j++) {
        //     arr[rightIndex] = arr[j];
        //     rightIndex++;
        // }

        for (int j = 0; j < rightArrlen; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // compaire this 2 array and set ans array

        int arrIndex = l;
        int p1 = 0;
        int p2 = 0;

        while (p1 < leftArr.length && p2 < rightArr.length) {

            if (leftArr[p1] < rightArr[p2]) {
                arr[arrIndex] = leftArr[p1];
                p1++;
                arrIndex++;
            } else {

                arr[arrIndex] = rightArr[p2];
                p2++;
                arrIndex++;

            }
        }

        // add remaining elements

        while (p1 < leftArr.length) {

            arr[arrIndex] = leftArr[p1];
            p1++;
            arrIndex++;

        }

        while (p2 < rightArr.length) {
            arr[arrIndex] = rightArr[p2];
            p2++;
            arrIndex++;
        }

    }
}
