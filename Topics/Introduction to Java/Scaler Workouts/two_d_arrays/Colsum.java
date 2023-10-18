package two_d_arrays;

// import java.sql.Array;
import java.util.Arrays;

public class Colsum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, },
                { 6, 7, 8, 9, 10 }
        };
        System.out.println(Arrays.toString(findColSum(arr)));
    }

    public static int[] findColSum(int[][] A) {

        // find maximum col length
        int max_col = 0;
        for (int i = 0; i < A.length; i++) {
            int colLength = A[i].length;
            if (colLength > max_col) {
                max_col = colLength;
            }
        }
        System.out.println(" maxCol =" + max_col);

        int[] sum = new int[max_col];
        for (int col = 0; col < max_col; col++) {
            int total = 0;
            for (int row = 0; row < A.length; row++) {
                System.out.print(A[row][col] + " ");
                // total += A[row][col];
            }
            // sum[col] = total;
            System.out.println();
        }
        return sum;
    }
}
