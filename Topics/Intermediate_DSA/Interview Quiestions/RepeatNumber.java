public class RepeatNumber {
    public static void main(String[] args) {
        // int[] a = { 4, 1, 3, 2, 4, 4, 3, 3, 7, 3, 4 };
        int[] a = { 1, 1, 1, 2, 3, 5, 7 };
        System.out.println(repeatElement(a));
    }

    public static int repeatElement(int[] A) {

        int n = A.length;
        if (n == 0) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int count1 = 0;
        int second = Integer.MIN_VALUE;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == first) {
                count1++;
            } else if (A[i] == second) {
                count2++;
            } else if (count1 == 0) {
                first = A[i];
                count1 = 1;
            } else if (count2 == 0) {
                second = A[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == first) {
                freq1++;
            } else if (A[i] == second) {
                freq2++;
            }
        }
        if (freq1 > n / 3) {
            return first;
        } else if (freq2 > n / 3) {
            return second;
        } else {
            return -1;
        }

    }
}
