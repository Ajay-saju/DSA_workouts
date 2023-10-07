import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.close();

        // int count = 1;
        // while (n >= 1) {
        // System.out.print(n + " ");
        // n--;
        // }
        // int start = 4;
        // while (start <= n) {
        // System.out.print(start + " ");
        // start += 4;
        // }

        // int start = n;
        // while (start >= 1) {
        // System.out.print(start + " ");
        // start--;
        // }
        // int start = 1;

        // while (start * start <= n) {

        // System.out.print(start * start + " ");
        // start++;
        // }
        int sum = 0;
        while (n < 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.print(sum);

    }
}
