public class Q2 {
    // find all the pairs which sum is K. (Elements are distinct)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};
        int k = 10;
        solve(arr,k);
    }

    private static void solve(int[] arr, int k) {

        int i = 0;
        int j = arr.length - 1;

        int count = 0;

        while (i < j) {

            if( arr[i] + arr[j] == k){
                count++;
                i++;
                j--;
            }else if ( arr[i] + arr[j] > k ){
                j--;
            }else{
                i++;
            }
            
        }
        System.out.println(count);
       
    }
}
