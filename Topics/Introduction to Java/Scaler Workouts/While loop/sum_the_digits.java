import java.util.Scanner;

public class sum_the_digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t > 0) {
            int n = scn.nextInt();
            int sum = 0;
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            System.out.println(sum);
            t--;
        }
    }
}
