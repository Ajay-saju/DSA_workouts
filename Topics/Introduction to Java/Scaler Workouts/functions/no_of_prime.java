package functions;

public class no_of_prime {
    public static void main(String[] args) {
        printPrime(11);
    }

    public static int printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            // boolean out = findPrime(i);
            if (findPrime(i) == true) {
                System.out.print(i + "\t");
            }
        }
        return 0;
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