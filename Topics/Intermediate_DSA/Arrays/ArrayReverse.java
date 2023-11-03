package Arrays;

import java.util.Arrays;

class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7 };
        // reveseArray(arr, arr.length);
        // reverseInARange(arr, arr.length, 2, 5);
        // System.out.println(Arrays.toString(arr));
        // rotateArray(arr, arr.length);

        System.out.println(case2(arr));
    }

    public static int case2(int[] A) {
        int largest = Integer.MIN_VALUE;
        int sLowest = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                idx = i;
                largest = A[i];
            }
        }
        // System.out.println(largest);
        for (int i = 0; i < A.length; i++) {
            if (idx != i) {
                if (A[i] > sLowest) {

                    sLowest = A[i];
                }
            }
        }
        return sLowest;
    }

    public static void reveseArray(int[] arr, int n) {

        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseInARange(int[] arr, int n, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int n) {
        int k = 3;
        k = k % n;
        reveseArray(arr, n);
        reverseInARange(arr, n, 0, k - 1);
        reverseInARange(arr, n, k, n - 1);
    }

    public static int solve(int[] A) {
        int n = A.length;
        int largest = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] > largest) {
                sl = largest;
                largest = A[i];
            } else if (A[i] > sl && A[i] != largest) {
                sl = A[i];
            }

        }
        if (n != 1) {
            return sl;
        } else {
            return -1;
        }

    }

}