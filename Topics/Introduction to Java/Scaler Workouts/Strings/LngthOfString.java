import java.util.Arrays;
import java.util.Scanner;

public class LngthOfString {
    public static void main(String[] args) {

        lengthOfStr();
    }

    public static void lengthOfStr() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String[] strArr = new String[n];
        System.out.println(strArr.length);
        for (int i = 0; i < n; i++) {
            String x = scn.nextLine();
            if (x != null && !x.isEmpty()) {
                strArr[i] = x;
            }
        }
        System.out.println(Arrays.toString(strArr));
        printLength(strArr);
    }

    public static void printLength(String[] arr) {
        for (String i : arr) {
            System.out.println(i.length());
        }
    }
}
