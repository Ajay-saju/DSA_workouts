import java.util.Scanner;

public class two_step_space {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= (n + 1) - row; star++) {
                System.out.print(" * ");
            }
            for (int space = 1; space <= (2 * row) - 2; space++) {
                System.out.print(" - ");
            }
            for (int star = 1; star <= (n + 1) - row; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
