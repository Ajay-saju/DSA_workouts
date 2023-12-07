package SlidingWindow;

public class TotalSAsum {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        System.out.println(findTotalSubArraySum(a));
    }

    public static int findTotalSubArraySum(int[] A) {
        int sum = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {

            int freq = (i + 1) * (n - i);
            System.out.println(freq);
            int contri = freq * A[i];
            sum += contri;
        }
        return sum;
    }
}
