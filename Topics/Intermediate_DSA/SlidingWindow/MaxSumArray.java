package SlidingWindow;

import java.util.*;

public class MaxSumArray {
    public static void main(String[] args) {
        // Given an array find the maximum sum in all subarrays .
        int[] a = { 10, 20, 30 };
        findTotalSubArraySum(a);
        // find the sum of all subarray sums.

    }

    public static void findTotalSubArraySum(int[] A) {
        int totalsum = 0;
        int n = A.length;
        for (int s = 0; s < n; s++) {

            int sum = 0;
            for (int e = s; e < n; e++) {
                sum += A[e];
                totalsum += sum;
                System.out.println(sum);
            }

        }
        System.out.println(totalsum);
        // Time Complexity = O(n^2)
        /// Space Complexity = O(1)
    }

    public static void usingCarryforword(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        for (int s = 0; s < A.length; s++) {
            int sum = 0;
            for (int e = s; e < A.length; e++) {
                sum += A[e];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
        // Time complexity O(n^2)
        // Space complexity O(1)
    }

    public static void usingPrifixSum(int[] A) {
        // int sum = 0;

        int[] pfsum = getPrifixSum(A);
        int n = A.length;
        System.out.println(Arrays.toString(pfsum));
        for (int s = 0; s < n; s++) {

            for (int e = s; e < n; e++) {
                int sum = 0;
                if (s != 0) {
                    sum = pfsum[e] - pfsum[s - 1];
                } else {
                    sum = pfsum[e];
                }
                System.out.println(sum);
            }
        }
        // return sum;
        // Time complexity O(n^2)
        // Space complexity O(n)
    }

    public static int[] getPrifixSum(int[] A) {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }
}
