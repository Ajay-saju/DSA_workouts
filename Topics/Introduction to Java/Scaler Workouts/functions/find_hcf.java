package functions;

public class find_hcf {
    public static void main(String[] args) {
        System.out.print(find_hcf(18, 12));
    }

    public static int find_hcf(int a, int b) {
        int hcf = 0;
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (i > hcf) {
                        hcf = i;
                    }

                }
            }
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (i > hcf) {
                        hcf = i;
                    }

                }
            }
        }

        return hcf;
    }
}