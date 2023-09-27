import java.util.Scanner;

public class easy_power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int start = 1;
        int output = a;
        while (start < b) {
            output = output * a;
            start++;
        }
        System.out.println(output);
        System.out.println(a + " * " + start + " = " + a * start);
    }
}
