import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double total = 0;
            if (n <= 50) {

                total = 0.5 * n;
                System.out.println(total);
            } else if (n <= 150) {
                // total = (0.5 * 50) + (0.75 * n-50);
                total = 50 * 0.50 + (n - 50) * 0.75;
                System.out.println(total);
            } else if (n <= 250) {
                total = (0.5 * 50) + (0.75 * 100) + (n - 150) * 1.20;
            } else {
                total = (0.5 * 50) + (0.75 * 100) + (1.20 * 100) + (1.50 * (n - 250));
            }
            System.out.print((int) (total + 0.2 * total));

        }
    }
}
