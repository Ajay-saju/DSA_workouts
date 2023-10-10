import java.util.Arrays;
import java.util.Scanner;

public class removing_elemnt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        scn.close();
        removeItem(arr, b);
        // System.out.println(Arrays.toString(removeItem(arr, b)));
    }

    public static int removeItem(int[] arr, int index) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (i >= index - 1) {
                arr[i] = arr[i + 1];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }
}
