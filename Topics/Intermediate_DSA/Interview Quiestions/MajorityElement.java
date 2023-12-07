public class MajorityElement {
    public static void main(String[] args) {
        // int[] a = { 3, 6, 1, 3, 2, 5, 3, 3, 3 };
        int[] a = { 2, 1, 1 };
        System.out.println(findMajorityElement(a));
    }

    public static int findMajorityElement(int[] A) {
        int majo = A[0];
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (count == 0) {
                majo = A[i];
                count = 1;
            } else {
                if (A[i] == majo) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        int freq = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == majo) {
                freq++;
            }
        }
        if (freq > A.length / 2) {
            return majo;
        } else {
            return 0;
        }
    }
}
