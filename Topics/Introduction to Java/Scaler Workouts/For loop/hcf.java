import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int hcf = 0;
        int larger = 0;
        if (a > b) {
            larger = a;
        } else {
            larger = b;
        }
        for (int i = 2; i <= larger; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        if (hcf > 1) {
            System.out.println(hcf);
        } else {
            System.out.print(1);
        }
    }
}
