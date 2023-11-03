package Prifix_Array;

import java.util.Arrays;

public class Normal_Prifix_Array {
    public static void main(String[] args) {
        int[] arr = { 2, 5, -1, 7, 1 };
        System.out.println(Arrays.toString(createPrifixArray(arr)));

    }

    public static int[] createPrifixArray(int[] arr) {
        int[] prifixArray = new int[arr.length];
        prifixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prifixArray[i] = prifixArray[i - 1] + arr[i];
        }
        return prifixArray;
    }
}
