import java.util.*;

public class q1 {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a nummber");
            int n = scn.nextInt();
            if (n % 2 == 0 && n > 0) {
                System.out.println("Even-Positive");
            } else if (n % 2 == 0 && n < 0) {
                System.out.println("Even-Negative");
            } else if (n % 2 != 0 && n > 0) {
                System.out.println("Odd-Positive");
            } else {
                System.out.println("Odd-Negative");
            }
        }

    }
}
