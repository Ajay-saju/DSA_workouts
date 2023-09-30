import java.util.Scanner;

public class reverse_with_space_inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" _ ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
