import java.util.Scanner;

public class bank_account {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int Start = 1;
        while (Start <= m) {
            int type = scn.nextInt();
            int x = scn.nextInt();

            if (type == 1) {
                n += x;
                System.out.println(n);
            } else {
                if (n < x) {
                    System.out.println("Insufficient Funds");
                } else {
                    n = n - x;
                    System.out.println(n);
                }
            }

            // else{
            // n =n-x;
            // if(n >0 ){
            // System.out.println(n);
            // }else{
            // System.out.println("Insufficient Funds");
            // }
            // }
            Start++;
        }
    }
}
