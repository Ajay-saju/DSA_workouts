package Strings;

public class Plindrome {
    public static void main(String[] args) {
        String s = "anamadamspe";
        int start = 2;
        int end = 7;
        System.out.println(checkPalindrome(s, start, end));

    }

    public static boolean checkPalindrome(String s, int start, int end) {

        int i = start;
        int j = end;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

}
