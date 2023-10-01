import java.util.Scanner;

public class leading_space_inverted_piramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            int star = 5;
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("_");
            }
            for (star = n; star >= row; star--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
