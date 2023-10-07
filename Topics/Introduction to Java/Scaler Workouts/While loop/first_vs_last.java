import java.util.Scanner;

public class first_vs_last {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        // int start = 1;
        // int f = 0;
        // int l = 0;

        // while (start <= t) {
        // int n = scn.nextInt();
        // l = n % 10;
        // n = n / 10;
        // if (n > 0) {
        // while (n > 0) {
        // f = n % 10;
        // n = n / 10;
        // }
        // } else {
        // f = l;
        // }
        // System.out.println(f + " " + l);
        // start++;

        // }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ld = n % 10;
            int fd = 0;
            while (n > 0) {
                fd = n % 10;
                n = n / 10;
            }
            // System.out.print(fd);
            System.out.println(fd + " " + ld);
            t--;
        }

    }
}
