import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; ++row) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" _ ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
}
