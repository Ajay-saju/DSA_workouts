import java.util.Scanner;

public class floyeds_triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Double f = scn.nextDouble();

        // Consume the newline character
        // scn.nextLine();

        String sentence = scn.nextLine();

        System.out.println("String: " + sentence);
        // System.out.println("Double: " + f);
        System.out.println("Int: " + n);

        scn.close();
    }
}
