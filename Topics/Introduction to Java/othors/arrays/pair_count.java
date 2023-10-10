public class pair_count {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        System.out.println(findPairCount(arr, 2));
    }

    public static int findPairCount(int[] a, int b) {
        int n = a.length;
        // int count;
        int count = 0;
        for (int i = 0; i < n; i++) {

            int x = a[i];
            for (int j = i + 1; j < n; j++) {
                if (x + a[j] == b) {
                    count++;
                }
            }
            // return count;
        }
        return count;
    }
}
