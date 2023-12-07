package Sliding_Window;

class PrifixSum {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30 };
        int[] out = getPrifixArray(A);
        // for (int i : out) {
        // // System.out.println(i);
        // }

        for (int s = 0; s < A.length; s++) {
            for (int e = s; e < A.length; e++) {
                int sum = 0;
                if (s == 0) {
                    sum = out[e];

                } else {
                    sum = out[e] - out[s - 1];
                }
                System.out.println(sum);
            }
        }
    }

    public static int[] getPrifixArray(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            A[i] = A[i] + A[i - 1];
        }
        return A;

    }
}