package functions;

public class fint_lcm {

    public static void main(String[] args) {
        System.out.print(find_lcm(4, 6));
    }

    public static int find_lcm(int a, int b) {
        int lcm = 1;
        if (a < b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    lcm = lcm * i;
                }
            }
        } else {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    lcm = lcm * i;
                }
            }
        }
        System.out.println(lcm);
        return lcm;
    }
}
