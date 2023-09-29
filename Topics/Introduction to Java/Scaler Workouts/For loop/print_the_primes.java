import java.util.Scanner;

public class print_the_primes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; i++) {

            int count = 0;
            int start = 1;
            while (start <= i) {
                if (i % start == 0) {
                    count++;
                    if (count > 2) {
                        break;
                    }
                }
                start++;
            }
            if (count <= 2) {
                System.out.println(i);
            }
        }

    }
}
