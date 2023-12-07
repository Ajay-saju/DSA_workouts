package subArrays;

import java.util.*;

public class AllSBArrays {
    public static void main(String[] args) {
        int[] a = { 5, 2, 1, 4 };
        int[][] out = solve(a);
        for (int[] i : out) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] solve(int[] A) {

        int n = A.length;
        int sb = n * (n + 1) / 2;
        // System.out.println(sb);
        int[][] ans = new int[sb][];
        int k = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                int[] temp = new int[end - start + 1];
                int j = 0;

                for (int i = start; i <= end; i++) {
                    System.out.print(A[i] + " ");
                    temp[j] = A[i];
                    j++;

                }
                System.out.println();
                System.out.println(Arrays.toString(temp));

                ans[k] = temp;
                k++;
            }
        }
        return ans;

    }
}
