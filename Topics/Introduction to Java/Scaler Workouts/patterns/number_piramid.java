import java.util.Scanner;

public class number_piramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n * 2 - 1; row++) {
            if (row > n) {
                for (int space = 1; space <= row - n; space++) {
                    System.out.print(" ");
                }
                for (int num = n * 2 - row; num > 1; num--) {
                    System.out.print(num);
                }
                for (int num = 1; num <= n * 2 - row; num++) {
                    System.out.print(num);
                }

            } else {

                for (int space = 1; space <= n - row; space++) {
                    System.out.print(" ");
                }
                for (int num = 1; num < row; num++) {
                    System.out.print(num + 1);
                }
                for (int num = 1; num <= row; num++) {
                    System.out.print(num);
                }
            }
            System.out.print("\n");
        }
    }
}
