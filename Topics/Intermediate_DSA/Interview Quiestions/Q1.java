// package Interview Quiestions;

public class Q1 {
    public static void main(String[] args) {

        int[] a = { 1, 1, 0, 1, 1, 1, 0, 1, };
        System.out.println(maxOnes(a));

    }

    public static int allOnes(int[] a) {
        int n = a.length;
        int ans = 0;
        int allOnes = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                allOnes++;
            }
            if (allOnes == n) {
                return n;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                int l = 0;
                int r = 0;
                int j = i + 1;
                while (j < n && a[j] == 1) {
                    r++;
                    j++;
                }
                j = i - 1;
                while (j >= 0 && a[j] == 1) {
                    l++;
                    j--;
                }
                if (l + r == allOnes) {
                    ans = Math.max(ans, l + r);
                    return ans;
                } else {
                    ans = Math.max(ans, l + r + 1);
                    return ans;
                }

            }

        }
        return 0;
    }

    public static int maxOnes(int[] A) {
        int n = A.length;
        int ans = 0;
        int totalOnes = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 1) {
                totalOnes += 1;
            }
            if (totalOnes == n) {
                return n;
            }
        }
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                int l = 0;
                int r = 0;
                int j = i + 1;
                while (j < n && A[j] == 1) {
                    r++;
                    j++;
                }
                j = i - 1;
                while (j >= 0 && A[j] == 1) {
                    l++;
                    j--;
                }
                ans = Math.max(ans, l + r + 1);
            }
        }
        return ans;
        // Time complexity = O(n)
        // Space complexity = O(1)
    }
}
