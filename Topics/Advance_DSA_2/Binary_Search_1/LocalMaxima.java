public class LocalMaxima {

    public static void main(String[] args) {
        int[] a = {
                4, 5, 8, 10, 1, 2, 3
        };
        System.out.println(findLocalMinima(a));
    }

    public static int findLocalMinima(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            }
            else if( arr[mid] < arr[mid +1] ){
                // go to left
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return  -1;
    }
}
