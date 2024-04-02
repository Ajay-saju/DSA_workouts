public class FindUniqEle {
    public static void main(String[] args) {
        int[] arr = { 3,3, 1, 1, 8, 8, 10, 10,  6, 6, 2, 2, 4, 4,19};
        System.out.println(searchUniq(arr));
    }


    private static int searchUniq(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if(arr[mid] == arr[mid -1]){
                mid = mid-1;
            }
            if( mid %2 ==0){
                // go to right

                low = mid +2;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }


}
