package Strings;

public class Char_Swap {
    public static void main(String[] args) {
        String A = "Hello World";
        int x = 'A';
        char c = 68;
        // System.out.println(c);
        solve(A);
    }

    public static String solve(String A) {

        char[] str = A.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++) {

            if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] = (char) (str[i] + 32);
            } else if (str[i] >= 'a' && str[i] <= 'z') {
                str[i] = (char) (str[i] - 32);
            }
        }
        System.out.println(str);
        return A = String.valueOf(str);

    }

    public static void swapChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            // char [] c = s.toCharArray();
            // s= String.valueOf(c);
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {

                c = (char) (c + 32);
                System.out.print(c);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
                System.out.print(c);
            }

        }
        // System.out.print(s);
        // return s;
    }
}
