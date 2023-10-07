// Reverse a number

import java.util.Scanner;

public class reverse_a_no {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev = 0;
        scn.close();

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        System.out.print(rev);
        

    }
}
