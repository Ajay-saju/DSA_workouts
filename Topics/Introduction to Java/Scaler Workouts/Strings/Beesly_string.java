class Beesly_string {
    public static void main(String[] args) {
        String str = "mpampamm";
        System.out.println(solve(str));
    }

    public static int solve(String A) {
        int n = A.length();
        for (int i = 0; i < A.length() / 2; i++) {
            System.out.println("i =" + i);
            char x = A.charAt(i);
            System.out.println("length=" + n);
            if (n > 1) {
                if (x == 'm' || x == 'p' || x == 'a') {
                    n = n - 2;
                    System.out.println("Remove 2");
                }
                System.out.println("N=" + n);
            }
        }
        System.out.println(n);
        if (n > 0) {
            return 0;
        }
        return 1;
    }
}