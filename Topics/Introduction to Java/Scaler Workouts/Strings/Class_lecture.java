package Strings;

import java.util.Scanner;

public class Class_lecture {
    public static void main(String[] args) {
        // printAscii("India");
        // printUpperCase();
        // System.out.println(countSpecial("kfas j323,//."));
        // System.out.println(passwordStrength("password"));
        // printAsci?i("India");
        // System.out.print(printAscii("a"));
        printAscii("a");
    }

    public static void printChar(String A) {
        for (int i = 0; i < A.length(); i++) {
            System.out.println(A.charAt(i));
        }
    }

    public static void printAscii(String A) {
        for (int i = 0; i < A.length(); i++) {
            int x = A.charAt(i);
            int y = x - 32;
            char c = (char) y;
            System.out.println(c);
        }
    }

    public static void printUpperCase() {
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        scn.close();
        for (int i = 0; i < A.length(); i++) {
            int x = A.charAt(i);
            if (x >= 65 && x <= 90) {
                System.out.println(A.charAt(i));
            }

        }
    }

    public static int countSpecial(String A) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
            // !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
                System.out.println(c);
                count++;
            }
        }
        return count;
    }

    public static String passwordStrength(String password) {
        int n = password.length();
        int numerics = 0;
        int alphabets = 0;
        int splChar = 0;
        for (int i = 0; i < n; i++) {

            char ch = password.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                numerics++;
            } else {
                splChar++;
            }
        }
        System.out.println(numerics);
        System.out.println(alphabets);
        System.out.println(splChar);
        // System.out.println(password);

        if (n <= 8) {
            return "low";
        } else if (alphabets > 0 && splChar == 0 && numerics == 0) {
            return "low";
        } else if (alphabets > 0 && numerics > 0 && splChar == 0) {
            return "MOdarate";
        } else if (alphabets > 0 && numerics > 0 && splChar > 0) {
            return "High";
        } else {
            return "Enter valid password";
        }

    }

    public static int countUppercase(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            // char x = a.charAt(i);
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int countAlphaNumeric(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String a) {
        String newString = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            // System.out.println(a.charAt(i));
            newString += a.charAt(i);

        }
        // System.out.println(newString);
        return newString;
    }

    public static boolean chrckPalindrome(String a) {

        // System.out.println(a);

        String out = reverseString(a);
        // System.out.println(out);
        // System.out.println(out);
        // System.out.println(a);
        // if (a.equals(out)) {
        // return true;
        // } else {
        // return false;
        // }
        // System.out.println(a.equals(out));
        return a.equals(out);

    }
}
