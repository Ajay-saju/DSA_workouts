package subArrays;

import java.util.Arrays;

class PrintAllSB {
    public static void main(String args[]) {
        int[] a = { 1, 2, 3 };
        // int[][] out = solve(a);
        // for (int[] i : out) {
        // // System.out.println(Arrays.toString(i));
        // }
        printSB(a);
    }

    public static int[][] solve(int[] A) {

        int n = A.length;
        int totalSA = n * n + 1 / 2;
        int[][] ans = new int[totalSA][n];

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int[] temp = new int[end - start + 1];
                int j = 0;
                for (int i = start; i <= end; i++) {
                    // System.out.println(A[i]);
                    temp[j] = A[i];
                    j++;
                    System.out.println(Arrays.toString(temp));
                }
                // System.out.println();
                ans[start] = temp;
            }

        }
        return ans;

    }

    public static void printSB(int[] a) {
        int n = a.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.println(end - start + 1);
                for (int i = start; i <= end; i++) {

                    // System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}