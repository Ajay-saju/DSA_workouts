package subArrays;

import java.util.*;

public class SBlength {
    public static void main(String[] args) {

        int[] arr = { 1, 6, 2, 3, 1, 4, 5, 1, 5, 6, 5, 4, };
        int[] c = { 1, 4, 5, 2, 4 };
        int[] b = {};
        // int[] out = findMInMax(c);
        System.out.println(findSubArraylength(arr));

    }

    public static int maxProfit(final int[] A) {
        int n = A.length;
        int max_profit = 0;
        for (int i = 0; i < n; i++) {
            int max = A[i];
            for (int j = i + 1; j < n; j++) {
                if (A[j] > max) {
                    max = A[j];
                }
            }
            int profit = max - A[i];
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;

    }

    public static int findSubArraylength(int[] arr) {
        int[] values = findMInMax(arr);
        int n = arr.length;
        int min = values[1];
        int max = values[0];
        int min_index = -1;
        int max_index = -1;
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                min_index = i;
                if (max_index != -1) {
                    ans = Math.min(ans, min_index - max_index + 1);
                }

            }
            if (arr[i] == max) {
                max_index = i;
                if (min_index != -1) {
                    ans = -Math.min(ans, max_index - min_index + 1);
                }

            }
        }
        return ans;

    }

    public static int[] findMInMax(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
        ans[0] = max;
        ans[1] = min;
        return ans;
    }

}
