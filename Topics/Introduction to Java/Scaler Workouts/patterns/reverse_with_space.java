import java.util.Scanner;

public class reverse_with_space {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            System.out.print("*");
            for (int space = 1; space <= n - row; space++) {
                System.out.print("_");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
