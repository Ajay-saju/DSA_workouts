import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter marks for subject A: ");
        int a = scn.nextInt();

        System.out.print("Enter marks for subject B: ");
        int b = scn.nextInt();

        System.out.print("Enter marks for subject C: ");
        int c = scn.nextInt();

        System.out.print("Enter marks for subject D: ");
        int d = scn.nextInt();

        System.out.print("Enter marks for subject E: ");
        int e = scn.nextInt();

        scn.close();

        int total = a + b + c + d + e;
        double avg = (total / 500.00) * 100;
        System.out.println(avg);
        if (avg >= 90) {
            System.out.print("A");
        } else if (avg >= 80) {
            System.out.print("B");
        } else if (avg >= 70) {
            System.out.print("C");
        } else if (avg >= 60) {
            System.out.print("D");
        } else if (avg >= 40) {
            System.out.print("E");
        } else {
            System.out.print("F");
        }

    }
}
