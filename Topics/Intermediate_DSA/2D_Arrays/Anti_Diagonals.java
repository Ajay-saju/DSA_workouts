import java.util.Arrays;

public class Anti_Diagonals {
    public static void main(String[] args) {

        int[][] SQmatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },

        };

        int[][] ar = solve(matrix);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[m][n];
        int[] temp = new int[m];
        System.out.println(n);
        System.out.println(m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = A[i][j];
            }
        }

        return ans;
    }

    public static int[][] diagonal(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int len = n + m - 1;
        int[][] ans = new int[len][m];
        int index = 0;
        for (int col = 0; col < m; col++) {
            int i = 0;
            int j = col;
            int val = 0;
            int count = 0;

            while (i < n && j >= 0) {

                val = A[i][j];
                ans[index][count] = val;
                count++;
                i++;
                j--;

            }
            index++;

        }

        for (int row = 1; row < n; row++) {
            int i = row;
            int j = m - 1;
            int val = 0;
            int count = 0;

            while (i < n && j >= 0) {

                val = A[i][j];
                ans[index][count] = val;
                count++;
                i++;
                j--;
            }
            index++;

        }
        return ans;
    }
}
