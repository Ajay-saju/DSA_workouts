import java.util.Scanner;

public class palindromic_integer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        scn.close();
        int temp = 0;
        int rev = a;

        while (rev > 0) {
            temp = temp * 10 + (rev % 10);
            rev = rev / 10;
        }
        if (a == temp) {
            System.out.print("yes");
        } else {
            System.out.print("No");
        }

    }
}
