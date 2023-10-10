public class con_dupe {
    public static void main(String[] args) {
        int[] arr = { 13, 1, 10, 111, 13, 2, 5 };
        // int[] arr = { 1, 2, 3, 3 };
        System.out.print(solve(arr));
    }

    public static boolean solve(int arr[]) {
        // Complete the function here
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // int x = arr[i];
            if (arr[i] == arr[i + 1]) {
                return true;
            }

            // for (int j = i + 1; j < n; j++) {
            // if (x == arr[j]) {
            // return true;
            // }
            // }??//
        }
        return false;
    }

}
