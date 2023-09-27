import java.util.Scanner;

public class simple_for_loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }

        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);

        }

    }
}
