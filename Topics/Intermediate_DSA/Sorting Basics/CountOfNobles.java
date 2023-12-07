// package Sorting Basics;

import java.util.Arrays;

public class CountOfNobles {

    public static void main(String[] args) {

        int[] a = { 1, -5, 3, 5, -10, 4 };
        int[] b = { -10, 1, 1, 2, 4, 4, 4, 8, 10 };

        Arrays.sort(a);
        Arrays.sort(b);
        // System.out.println(findNobleCout(a));
        System.out.println(findNobledis(b));

    }

    // Same Problem but elements are not distinct.
    public static int findNobledis(int[] a) {
        int ans = 0;
        int count = 0;
        if (a[0] == 0) {
            ans++;

        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                count = i;
            }
            if (a[i] == count) {
                ans++;
            }

            System.out.println("i == " + i + "  a[i]== " + a[i] + "  count= " + count);

        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int p = 0;
        int q = n - 1;
        while (p < q) {
            int temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            p++;
            q--;
        }
        int ans = 0;
        if (A[0] == 0) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            int count = 0;

            if (A[i] != A[i - 1]) {
                count = i;
            }
            if (count == A[i]) {
                ans++;
            }
        }
        if (ans > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int findNobleCout(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i) {
                ans++;
            }
        }
        return ans;
    }

}
