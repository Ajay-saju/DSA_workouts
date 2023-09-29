import java.util.Scanner;

public class amstrongno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int t = i;
            int amg = 0;
            while (t > 0) {
                int rev = t % 10;
                amg += (rev * rev * rev);
                t = t / 10;
            }
            if (i == amg) {
                System.out.println(amg);
            }

        }
        // Scanner scn = new Scanner(System.in);
        // int i = scn.nextInt();
        // for (int n = 1; n <= i; n++) {
        // int amg = 0;
        // int temp = n;
        // while (temp > 0) {
        // int rev = temp % 10;
        // amg = amg + (rev * rev * rev);
        // temp = temp / 10;
        // }
        // if (i == amg)
        // System.out.println(amg);
        // }

    }
}
