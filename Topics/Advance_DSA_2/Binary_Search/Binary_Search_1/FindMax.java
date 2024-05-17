public class FindMax {

    // given an increasing decreasing array with distinct elements, find the maximum element ?
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10, 13,15,12,6};
        System.out.println(findMaxElement(arr));
    }

    private static int findMaxElement(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            //case 1
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            // case 2
            else if (arr[mid]> arr[mid-1]) {
                // go to right
                low = mid+1;

            }else {
                high= mid-1;
            }
        }
        return  -1;
    }
}
