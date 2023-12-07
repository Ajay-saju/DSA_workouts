package Strings;

import java.util.Arrays;

public class LongestPalindrom {
    public static void main(String[] args) {
        String s = "the blue sky  ";
        System.out.println(solve(s));

    }

    public static String solve(String A) {

        String str = "";

        String current = "";

        for (int i = A.length() - 1; i >= 0; i--) {

            if (A.charAt(i) != ' ') {

                current = "";

                while (i >= 0 && A.charAt(i) != ' ') {
                    current += A.charAt(i);
                    i--;
                }

                str += reverseString(current);
                if (current != "") {
                    str += " ";
                }
            }

        }

        return str.trim();
    }

    public static String reverseString(String s) {
        // System.out.print(s);

        String str = "";
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            // sb.replace(i, i, '#');
            sb.append(s.charAt(i));
        }
        str = sb.toString();

        // System.out.println(str);
        return str;
    }

    public static String longestPalindrome(String A) {
        int n = A.length();
        int ans = 0;
        int start = 0;
        int end = 0;
        String str = "";

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;

            while (l >= 0 && r < n) {
                if (A.charAt(l) != A.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, r - 1 - l);
            start = l + 1;
            end = r - 1;
            if (end - start + 1 == ans) {
                str = "";
                for (int j = start; j <= end; j++) {
                    char c = A.charAt(j);
                    str = str + c;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i + 1;

            while (l >= 0 && r < n) {
                if (A.charAt(l) != A.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, r - 1 - l);
            start = l + 1;
            end = r - 1;

            if (end - start + 1 == ans) {
                str = "";
                for (int j = start; j <= end; j++) {
                    char c = A.charAt(j);
                    str = str + c;
                }
            }
        }

        return str;
    }

    public static void findPalindrome(String s) {

        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < n) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, r - 1 - l);
        }
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < n) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, r - 1 - l);
        }
        System.out.println(ans);
    }

    private String expand(String A, int left, int right) {
        while (left >= 0 && right < A.length()) {
            if (A.charAt(left) == A.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return A.substring(left + 1, right);
    }

    public String longestPalindrom(String A) {
        String ans = "";
        for (int i = 0; i < A.length(); i++) {
            String oddPalindrom = expand(A, i - 1, i + 1);
            String evenPalindrom = expand(A, i, i + 1);
            String greater = oddPalindrom;
            if (oddPalindrom.length() < evenPalindrom.length()) {
                greater = evenPalindrom;
            }
            if (greater.length() > ans.length()) {
                ans = greater;
            }
        }
        return ans;
    }
}
