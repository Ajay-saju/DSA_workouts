package Prifix_Array;

import java.util.*;

public class Equilibrium_index {
    public static void main(String[] args) {

        int[] a = { -7, 1, 5, 2, -4, 3, 0 };
        // System.out.println(Arrays.toString(createPrifixArray(a)));
        // System.out.println(Arrays.toString(createSufuxArray(a)));
        System.out.println(findEQindex(a));
    }

    public static int findEQindex(int[] A) {
        int n = A.length;
        int ans = -1;
        int[] PFarr = createPrifixArray(A);
        System.out.println(Arrays.toString(PFarr));
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            if (i > 0) {
                leftSum = PFarr[i - 1];
            }
            rightSum = PFarr[n - 1] - PFarr[i];
            // if (i == 0) {
            // leftSum = 0;
            // // rightSum = PFarr[n - 1];
            // System.out.println(leftSum + " " + rightSum);
            // } else {
            // leftSum = PFarr[i - 1];
            // rightSum = PFarr[n - 1] - PFarr[i];
            // }
            if (leftSum == rightSum) {
                // System.out.println(leftSum + " " + rightSum);
                ans = i;
                return ans;

            }
            // break;

        }

        return ans;
    }

    public static int solve(int[] A) {

        int[] PFarr = createPrifixArray(A);
        int[] SFarr = createSufuxArray(A);
        int count = 0;
        int ans = -1;
        int n = PFarr.length;
        for (int i = 0; i < n; i++) {
            if (PFarr[i] == SFarr[i]) {
                return ans = i + 1;
                // break;
            }
            // break;
        }
        return ans;

    }

    public static int[] createPrifixArray(int[] arr) {
        int[] PF = new int[arr.length];
        PF[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            PF[i] = PF[i - 1] + arr[i];
        }
        // System.out.println(Arrays.toString(PF));
        return PF;
    }

    public static int[] createSufuxArray(int[] arr) {
        int n = arr.length;
        int[] SF = new int[arr.length];
        SF[0] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            SF[i] = SF[i - 1] + arr[n - (i + 1)];
        }
        // for (int i = n - 2; i >= 0; i--) {

        // SF[i] = SF[i + 1] + arr[i];
        // }
        // int i = 0;
        // int j = n - 1;
        // while (i < j) {
        // int temp = SF[j];
        // SF[j] = SF[i];
        // SF[i] = temp;
        // i++;
        // j--;

        // }
        return SF;
    }
}
