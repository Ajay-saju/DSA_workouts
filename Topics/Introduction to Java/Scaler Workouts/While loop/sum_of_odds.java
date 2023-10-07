import java.util.Scanner;

public class sum_of_odds {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= a) {
            sum = sum + start;
            start = start + 2;
        }
        System.out.print(sum);
    }
}
