import java.util.Scanner;

// Revers a no
public class q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        while (n > 0) {

            System.out.println(n % 10);
            n = n / 10;
        }

    }
}
