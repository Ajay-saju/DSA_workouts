import java.util.Scanner;

public class photo_frame_patter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int start = 1; start <= n; start++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int space = 1; space <= n - 2; space++) {
                    System.out.print("_");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}