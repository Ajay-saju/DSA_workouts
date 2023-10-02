import java.util.Scanner;

public class half_diamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= (2 * n) - 1; row++) {

            if (row > n) {
                for (int star = 1; star <= (n * 2) - row; star++) {
                    System.out.print("*");
                }
            } else {
                for (int star = 1; star <= row; star++) {
                    System.out.print("*");
                }
            }

            System.out.print("\n");
        }
    }
}
