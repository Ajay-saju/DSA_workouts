import java.util.Scanner;

// Sum of numbers.
public class q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        scn.close();
        while (n > 0) {

            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
