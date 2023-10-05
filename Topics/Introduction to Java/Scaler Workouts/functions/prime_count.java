package functions;

public class prime_count {
    public static void main(String[] args) {
        System.out.print(findCount(11));
    }

    public static int findCount(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (findPrime(i) == true) {
                count++;
            }
        }
        return count;
    }

    public static boolean findPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
            if (count > 2) {
                break;
            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
