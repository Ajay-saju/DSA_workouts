public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 5, 5, 5, 5, 8, 8, 10, 12};
        int k = 5;
        System.out.println(lastFirstOccurrence(arr, k));
    }

    private static int lastFirstOccurrence(int[] arr, int k) {
        int n = arr.length;

        int ans = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if( arr[mid] ==k ){
                ans = mid;
                low = mid + 1 ;
            } else if (arr[mid]>k) {
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return ans;


    }
}
