import java.util.Arrays;

public class TwoDMetrix {
    public static void main(String[] args) {
        int[][] a = {
                { 0, 1, 2 },
                { 3, 4, 5, },
                { 6, 7, 8 } };
        int[][] b = findZero(a);
        for (int[] i : b) {
            System.out.println(Arrays.toString(i));
        }

    }

    public static int[][] findZero(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                for (int j = 0; j < A[i].length; j++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }

                }
            }

        }
        for (int j = 0; j < m; j++) {
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (A[i][j] == 0) {
                    flag = 1;
                }

            }
            if (flag == 1) {
                for (int i = 0; i < n; i++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

}
