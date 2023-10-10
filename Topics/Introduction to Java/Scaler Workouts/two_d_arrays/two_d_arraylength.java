package two_d_arrays;

public class two_d_arraylength {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, },
                { 6, 7, 8, 9 }
        };
        printArrayLrngth(arr);
    }

    public static void printArrayLrngth(int[][] arr) {
        // printing array length
        System.out.println("Row lenght" + arr.length); // printing row lenght
        System.out.println("Col length" + arr[0].length); // printing column lenght
        int n = arr.length;
        int m = arr.length;
        for (int row = 0; row < n; row++) {
            // for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row].length + " ");
            // }
        }

    }
}
