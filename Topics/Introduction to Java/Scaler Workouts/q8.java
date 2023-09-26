import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int start = 1;
        scn.close();
        while (start * start <= n) {
            System.out.print(start * start + " ");
            start++;
        }
    }

}
