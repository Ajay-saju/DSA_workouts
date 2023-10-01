import java.util.Scanner;

public class number_triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        for (int row = 1; row <= n; row++) {

            for (int zeros = 1; zeros <= n - row; zeros++) {
                System.out.print(0 + " ");
            }
            for (int nums = 1; nums <= (row * 2) - 1; nums++) {
                System.out.print(temp * nums + " ");
            }
            temp--;
            for (int zeros = 1; zeros <= n - row; zeros++) {
                System.out.print(0 + " ");
            }
            System.out.print("\n");
        }

    }
}