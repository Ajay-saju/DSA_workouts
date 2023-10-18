import java.sql.Array;
import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int[] arr2 = shuffle(arr, 3);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] shuffle(int[] nums, int n) {

        int l = nums.length;
        int[] myArray = new int[l];
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            myArray[i] = x;
            System.out.println("X=" + x);
            int y = nums[n + i];
            myArray[i + 1] = y;
            System.out.println(i + 1 + "th =" + y);
            i++;
        }
        return myArray;
    }
}