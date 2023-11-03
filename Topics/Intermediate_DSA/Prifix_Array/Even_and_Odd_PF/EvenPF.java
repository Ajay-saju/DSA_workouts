
package Even_and_Odd_PF;

import java.util.Arrays;

public class EvenPF {
    // GIven an array size N and Q quierys with start(S) and ends (E) index. For
    // every query return the sum of all even indexed
    // elements froma S to E .

    public static void main(String[] args) {

        int[][] qr = {
                { 1, 3 },
                { 2, 5 },
                { 0, 4 },
                { 3, 3 },
        };
        int[] arr = { 2, 3, 1, 6, 4, 5 };
        // findQueryEvenSum(qr, arr);
        System.out.println(Arrays.toString(createOddPF(arr)));
    }

    public static void findQueryEvenSum(int[][] query, int[] arr) {

        // create Prifix Even Array .
        int[] PFEven = evenPF(arr);
        // find the sum

        for (int i = 0; i < query.length; i++) {

            // int L = query[i][0];
            // int R = query[i][1];
            int L = query[i][0];
            int R = query[i][1];
            int sum = 0;
            if (L == 0) {
                sum = PFEven[R];
            } else {
                sum = PFEven[R] - PFEven[L - 1];
            }
            System.out.println(sum);
        }

    }

    public static int[] evenPF(int[] arr) {

        int[] PFE = new int[arr.length];
        PFE[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (i % 2 == 0) {
                // System.out.println("even i ==" + i);
                PFE[i] = PFE[i - 1] + arr[i];
            } else {
                // System.out.println("odd i ==" + i);
                PFE[i] = PFE[i - 1];
            }
        }

        return PFE;
    }

    public static int[] createOddPF(int[] arr) {
        int[] PFOdd = new int[arr.length];
        PFOdd[0] = 0;

        for (int i = 1; i < arr.length; i++) {

            if (i % 2 != 0) {

                PFOdd[i] = PFOdd[i - 1] + arr[i];
            } else {
                PFOdd[i] = PFOdd[i - 1];
            }
        }
        return PFOdd;
    }

}
