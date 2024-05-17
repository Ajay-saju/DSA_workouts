public class SearchInTwoD_Array {

    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {4},
                {7}, {8}, {9}, {13}, {15}

        };
        int b = 7;
        System.out.println(findB(arr, b));
    }

    private static int findB(int[][] arr, int b) {

        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = m * n - 1; int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int  col = mid % m;

            if( m==1){
                row = mid%n;
                col = 0;
            }
            if (arr[row][col] == b) {
                return 1;
            } else if (arr[row][col] > b) {
                // go to left

                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
