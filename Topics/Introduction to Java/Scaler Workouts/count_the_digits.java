import java.util.Scanner;

public class count_the_digits {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t >= 1) {
            int n = scn.nextInt();
            int count = 0;
            if (n == 0) {
                count = 1;
            } else {
                while (n > 0) {
                    count++;
                    n = n / 10;

                }
            }

            System.out.println(count);
            t--;

        }
    }
}
