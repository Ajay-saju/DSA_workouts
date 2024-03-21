class Problem1 {

    // we have array where every element occurs twice except one number find that number
    public static void main(String[] args) {

        int[] a = {2, 3, 5, 6, 3, 6, 2};
        findUniqEle(a);

    }
    public static boolean checkBit(int n, int i) {

        if ((n & (1 << i)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void findUniqEle(int[] arr) {


        int ans = 0;
        for (int i = 0; i < 31; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (checkBit(arr[j], i)) {
                    count++;
                }
            }
            if ((count & 1) != 0) {
                ans += 1 << i;
            }
        }
        System.out.println(ans);

    }
}