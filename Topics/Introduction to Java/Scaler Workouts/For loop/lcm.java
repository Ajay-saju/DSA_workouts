import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

        int lcm = 1;
        if (a > b) {
            lcm = a;
        } else {
            lcm = b;
        }
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
    }
}
