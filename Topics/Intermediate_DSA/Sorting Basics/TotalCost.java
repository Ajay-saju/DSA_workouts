
// package Sorting Basics;
import java.util.*;

public class TotalCost {
    // Find the minimum cost to remove all elements from an array
    public static void main(String[] args) {

        Integer[] a = { -3, 5, 1, 2 };
        int[] b = { 5, 3, 1, -3 };
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        System.out.println(solve(b));

    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += A[i] * (n - i);

        return sum;
    }

    public static int minimumCost(Integer[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
            ans += A[i] * (i + 1);
        }
        return ans;
    }

    // Time Complexity = O(nlogn)
    // Space Complexity = O(1);
}
