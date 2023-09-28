import java.util.Scanner;

public class is_it_perfect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();
            int pd = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    System.out.print(j + " ");
                    pd = pd + j;
                }
            }
            if (n == pd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
