package SlidingWindow;

public class MaxSASumK {

    public static void main(String[] args) {

        // given an array of N elemnts print maximum sub array sum for sub array with
        // length K.
        int[] a = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int n = a.length;
        int K = 5;
        findMaxSum(a, n, K);
    }

    public static void findMaxSum(int[] A, int N, int K) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int s = 0;
        int e = K - 1;
        for (int i = s; i <= e; i++) {
            sum = sum + A[i];
        }
        s++;
        e++;
        while (e < N) {
            sum = sum + A[e] - A[s - 1];
            s++;
            e++;
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);

    }

}
