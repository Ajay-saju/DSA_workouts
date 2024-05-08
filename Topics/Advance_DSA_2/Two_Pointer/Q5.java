public class Q5 {

    // Given an integer array with +ve elements and an integer K. check if there
    // exists a subarray with the sum K .

    public static void main(String[] args) {

        int[] arr = { 1, 3, 15, 20, 10, 3, 23 };
        int k = 33;
        System.out.println(solve(arr, k));

    }

    private static boolean solve(int[] arr, int k) {

        int i = 0;
        int j = 0;
        int sum = arr[0];
        int n = arr.length;

        while (j < n) {

            if (sum == k) { 

                return true;

            } else if (sum > k) {

                sum -= arr[i];
                i++;
                if (i > j && i <= n - 1) {
                    j++;
                    sum += arr[j];
                }
            }else{

                j++ ;
                if( j == n ){
                    break;
                }
                sum +=arr[j];
            }
        }
        return false;
    }

}
