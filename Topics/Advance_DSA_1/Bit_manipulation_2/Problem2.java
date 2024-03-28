public class Problem2 {

    public static void main(String[] args) {
        int[] a = {5, 7, 5, 9, 7, 11, 11, 7, 5, 11};

        findUniqNo(a);
    }

    public static void findUniqNo(int[] a) {
        int ans = 0;

        for (int i = 0; i < 31; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (checkbit(a[j], i)) {
                    count++;
                }
            }
            if (count % 3 !=0) {
                ans += 1 << i;
            }
        }
        System.out.println(ans);
    }

    public static boolean checkbit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;

        } else {
            return false;
        }
    }

}
