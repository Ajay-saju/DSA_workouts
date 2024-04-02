public class LocalMinima {

    // given an array of N distinct elements, find any local minima in the array
    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 7, 6, 4, 1, 5};
        System.out.println(findLocalMinima(arr));
    }

    private static int findLocalMinima(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        if (n == 0) {
            return arr[0];
        }
        if (arr[0] < arr[1]) {
            return arr[0];
        }
        if(arr[n-1]<arr[n-2]){
            return arr[n-1];
        }
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
                return arr[mid];
            } else if (arr[mid]<arr[mid+1]) {
                // go left
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
