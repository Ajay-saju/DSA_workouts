package Strings;

public class PlayingWithSTR {
    public static void main(String[] args) {
        System.out.println(solve("hgUe"));
    }

    public static String solve(String A) {
        A = A.concat(A);
        A = A.replaceAll("[A-Z]", "");
        A = A.replaceAll("[aeiuou]", "#");

        return A;

    }
}
