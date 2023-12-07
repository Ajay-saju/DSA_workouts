package Strings;

public class LongestPrefix {
    public static void main(String[] args) {

        String[] values = { "abcd", "abcd", "efgh" };
        String vsl = "ABEC";
        System.out.println(solve(vsl));

    }

    public static String findSmallStr(String[] A) {
        int min = Integer.MAX_VALUE;
        String minString = "";
        for (String i : A) {
            if (i.length() < min) {
                min = i.length();
                minString = i;
            }
        }
        return minString;
    }

    public static String longestCommonPrefix(String[] A) {
        String ans = "";

        String small = findSmallStr(A);
        // System.out.println(small);
        for (int i = 0; i < small.length(); i++) {
            boolean isQlified = true;
            char ch = small.charAt(i);

            for (int j = 0; j < A.length; j++) {
                if (A[j].charAt(i) != ch) {
                    isQlified = false;
                    break;
                }
            }

            if (isQlified) {
                ans += ch;
            }
        }
        return ans;
    }

    public static int solve(String A) {
        char[] str = A.toLowerCase().toCharArray();
        int n = str.length;
        int mod = 10003;
        // System.out.println(n);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = str[i];
            if ("aeiou".indexOf(c) != -1) {
                ans = ((ans + n - i) % mod) % mod;
            }
        }
        return ans;
    }

}
