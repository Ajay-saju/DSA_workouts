package Extra_workout;

import java.util.*;

public class Prifixsum {

    public static void main(String[] args) {

        int[] A = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        System.out.println(Arrays.toString(createPrifixArray(A)));

    }

    public static int[] createPrifixArray(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            A[i] = A[i] + A[i - 1];
        }
        return A;

    }

}
