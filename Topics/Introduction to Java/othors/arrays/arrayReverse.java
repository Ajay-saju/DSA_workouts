import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {

        //  two pointer method 
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // System.out.print(Arrays.toString(arr));
    }
}