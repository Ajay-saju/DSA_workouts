package functions;

public class is_perfect_squre {
    public static void main(String[] args) {
        System.out.print(solve(8430800));
    }

    public static int solve(int A) {
        int count = 0;
        for (int i = 1; i <= A; i++) {
            if (i * i == A) {
                count++;
            }
        }
        if (count == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
