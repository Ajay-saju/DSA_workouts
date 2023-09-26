import java.util.Scanner;

public class decent_print {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = n;
        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }
    }
}
