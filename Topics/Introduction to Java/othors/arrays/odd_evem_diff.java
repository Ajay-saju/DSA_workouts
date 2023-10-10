import java.util.Scanner;

public class odd_evem_diff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            findElements(arr);
        }
    }

    public static int findElements(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(Math.abs(even - odd));
        return 0;
    }
}
