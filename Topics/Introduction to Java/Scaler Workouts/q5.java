import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();
        // if (a <= b && a <= c) {

        // System.out.print(a);

        // } else if (b <= a && b <= c) {
        // System.out.print(b);
        // } else {
        // System.out.print(c);
        // }
        if (a < b && a < c) {

            System.out.print(a);

        } else if (b < c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}
