import java.util.Scanner;

public class reverse_patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row + 1) - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}